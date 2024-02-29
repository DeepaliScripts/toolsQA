package Practice09_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class check {

	
	@Test(dataProvider="LoginDataProvider")

	public void TestLogin(String username, String password){

		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();

	    driver.manage().window().maximize();

	    driver.get("<https://demosite.executeautomation.com/>");

	    driver.findElement(By.name("UserName")).sendKeys(username);

	    driver.findElement(By.name("Password")).sendKeys(password);

	    driver.findElement(By.name("Login")).submit();

	    Assert.assertEquals("User Form", driver.findElement(By.tagName("h2")).getText());

	    driver.quit();

	}

	@DataProvider(name = "LoginDataProvider")

	public Object[][] LoginData(){

	return new Object[][] 

	{

	        { "abc", "***" },

	        { "xyz", "***" },

	        { "mno", "***" }

	};

	}

}
