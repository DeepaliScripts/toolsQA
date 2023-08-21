package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singletypedatepicker {

	public static void main(String[] args) {
		
		String expectedDay = "17";
		String expectedMonth = "May";
		String expectedYear = "2023";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement dateinput = driver.findElement(By.id("datepicker"));
		dateinput.click();
		
		
		while(true) {
			String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear))
			{
				 List<WebElement> dateRange = driver.findElements(By.xpath("//table/tbody/tr/td"));
				 for (WebElement e:dateRange) 
				 {
					 String calendarDay = e.getText();
					 if (calendarDay.equals(expectedDay)) {
						 e.click();
						 break;
					 }
				 }
				 break;	 
			}
			
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}	
	}
}
