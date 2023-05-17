package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("userid"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(username);
		
		username.click();
		username.sendKeys("deepali");
		
		WebElement password = driver.findElement(By.name("pswrd"));
		password.click();
		password.sendKeys("gautam");
		
	}

}
