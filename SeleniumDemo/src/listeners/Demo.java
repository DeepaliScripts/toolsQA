package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)
@Test
public class Demo {
	
	public void testone() {
	
	WebDriver driver = new SafariDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	Assert.assertEquals(driver.getTitle(), "Your 1Store");

}
}
