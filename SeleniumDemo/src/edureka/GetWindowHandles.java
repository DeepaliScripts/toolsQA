package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://bing.com");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).sendKeys("t").keyUp(Keys.COMMAND).perform();
		
		

	}

}
