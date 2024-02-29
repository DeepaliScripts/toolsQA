package listen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listen.class)
@Test
public class login {

	public void testone() {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Assert.assertEquals(driver.getTitle(), "Your Store");

	}

}
