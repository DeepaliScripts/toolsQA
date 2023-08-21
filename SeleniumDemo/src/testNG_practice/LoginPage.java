package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test (dependsOnMethods = "pretests")
public class LoginPage {
	
	public void page() {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		String actual = driver.getTitle();
		String expected = "Swag Labs1";
		
		Assert.assertEquals(actual, expected);
			
	}

}
