package handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class HandleHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement window2 = driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a"));
		window2.click();
		
		String DefaultWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> itr = allWindows.iterator();
		
		itr.next();
		String ChildWindow = itr.next();
		
		driver.switchTo().window(ChildWindow);
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(DefaultWindow);
		Thread.sleep(3000);
		driver.close();
		
	}

}
