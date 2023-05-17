package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		googlesearch();

	}
	
	public static void googlesearch() throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		driver.manage().window().maximize();
		
		WebElement feed = driver.findElement(By.id("datepicker"));
		
		feed.click();
		
		Thread.sleep(3000);
		
		feed.sendKeys("04/27/2023");
		
		feed.sendKeys(Keys.RETURN);
	}

}
