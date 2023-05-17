package wait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.className("dropbtn"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement clicker = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		clicker.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		//element.click();
		

	}

}
