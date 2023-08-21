 package pagebjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WithoutPOM {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		String actual = driver.getTitle();
		System.out.println(actual);

	}

}
