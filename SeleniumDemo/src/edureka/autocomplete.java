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

import io.github.bonigarcia.wdm.WebDriverManager;



public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new SafariDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		
		WebElement city = driver.findElement(By.className("fsw_inputField lineHeight36 latoBlack font30"));
		
		city.click();
		Thread.sleep(5000);
		
		city.sendKeys("New Delhi");
			

}
	}
