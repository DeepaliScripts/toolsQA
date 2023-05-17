package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class desiredCapabilities {

	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver = new SafariDriver();
		driver.get("https://google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("shradha kapoor");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		driver.quit();
		

	}

}
