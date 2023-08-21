package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGdemo {
	
	@Test
	public void verifyPageTitle() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Google1";
		

		AssertJUnit.assertEquals(actualtitle, expectedtitle);
		
	}
	

}
