package Practice09_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.util.Assert;

public class dataProviders {
	
	
	
	@DataProvider(name="testdata")
	public Object[][] method1() {
		Object[][] credentials = new Object[2][2];
		credentials[0][0] = "username1@gmail.com";
		credentials[0][1] = "Password1";
		credentials[1][0] = "student";
		credentials[1][1] = "Password123";
		return credentials;
		
	}
	@Test(dataProvider = "testdata")
	public void testLogin(String username, String password) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("submit")).click();
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(driver.findElement(By.xpath("//*[@id=\\\"loop-container\\\"]/div/article/div[1]/h1")).getText().equals("Logged In Successfully"));		
		driver.quit();
		
		
		
		
		
	}
	
	
	
}
