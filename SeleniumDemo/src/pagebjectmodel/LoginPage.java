package pagebjectmodel;
import org.openqa.selenium.By;

//without Page Factory
import org.openqa.selenium.WebDriver;
public class LoginPage {
	
	WebDriver driver ;	
	LoginPage(WebDriver d)
	{
		driver = d;
		
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys("uname");
		 	
	}
	
	public void enterPassword(String pword) {
		driver.findElement(password).sendKeys("pword");
	}
	
	public void enterbtn () {
		driver.findElement(loginButton).click();
	}

}
