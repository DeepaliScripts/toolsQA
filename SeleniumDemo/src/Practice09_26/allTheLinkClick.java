package Practice09_26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class allTheLinkClick {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = 0;
		
		for (WebElement e : links) {
			
			System.out.println(e.getAttribute("href"));
			
			count++;
			
		}
		
		System.out.println(count);

	}

}
