package doubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;


public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000)");
		
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		WebElement btn = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		
		act.doubleClick(btn).build().perform();
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys(Keys.RETURN);
		act.keyUp(Keys.CONTROL);
		
		act.perform();
		
		
		

	}

}
