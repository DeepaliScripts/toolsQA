package listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listeners.PrachiListen.class) //test class and listener class integrated
public class ListenersPrachi {
	
	@Test
	public void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		String actual = driver.getTitle();
		
		String expected = "Logged In Successfully | Practice Test Automation";
		
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void testfail()  {
		System.out.println("failed test case");
		Assert.assertTrue(false);
	}
		
	@Test
	public void skip()  {
		System.out.println("skipped test case");
		throw new SkipException("skipped exception throws");
	}
		

}
