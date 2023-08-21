package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDatePickers {

	public static void main(String[] args) {
		String expectedDay = "30";
		String expectedMonthYear = "May 2023";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement dateinput = driver.findElement(By.xpath("//label[@for='departure']"));
		dateinput.click();


		while(true) {
			String calendarMonthYear = driver.findElement(By.xpath("1")).getText();

			if(calendarMonthYear.equals(expectedMonthYear))
			{
				List<WebElement> dateRange = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
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
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}	
	}


}


