package pagebjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce1");
		
		lp.enterbtn();
	}

}
