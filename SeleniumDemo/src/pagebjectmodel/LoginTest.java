package pagebjectmodel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		
		
		
		LoginPage2 lp = new LoginPage2(driver);
		
		driver.get("https://www.saucedemo.com/");
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.enterbtn();
		
		//
	}

}
