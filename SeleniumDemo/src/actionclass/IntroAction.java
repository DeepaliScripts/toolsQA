package actionclass;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;


public class IntroAction {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		WebElement username = driver.findElement(By.name("userid"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(username).sendKeys("deepali").build();
		
		
		

	}

}
