package assertions;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertions {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver; 
		//tells Java to treat the driver reference variable as if it were an instance of the TakesScreenshot interface
		
		//SoftAssert soft = new SoftAssert();
		
		//soft.assertTrue(driver.getTitle().equals("omayo"));

		Assert.assertTrue(driver.getTitle().equals("xyz"));
		
		System.out.println("all good");

	}

}
