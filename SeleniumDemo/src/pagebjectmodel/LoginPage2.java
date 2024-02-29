package pagebjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage2 {
	
	WebDriver driver;
	LoginPage2(WebDriver d)
	{
		driver =  d;
		PageFactory.initElements(driver, this);
	}

	//identify web elements
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement lgnbtn;
	
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
		 	
	}
	
	public void enterPassword(String pword) {
		password.sendKeys(pword);
	}
	
	public void enterbtn () {
		lgnbtn.click();
	}
	
	
	
}
