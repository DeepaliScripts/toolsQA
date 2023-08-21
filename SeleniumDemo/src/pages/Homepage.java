package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homepage {
	
	private WebDriver driver;

	public void homepage () {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		System.out.println("deepali");
	
	}
	
	By loginbtn =By.id("Login");
	
	public void clickLoginButton() {
        driver.findElement(loginbtn).click();
    }

}
