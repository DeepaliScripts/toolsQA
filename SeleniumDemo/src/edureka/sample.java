package edureka;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();



		
		
		
	}

}
