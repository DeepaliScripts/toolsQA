package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class AlertOK {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		//driver.findElement(By.id("confirm")).click();
		driver.findElement(By.id("prompt")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("deepali");
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
