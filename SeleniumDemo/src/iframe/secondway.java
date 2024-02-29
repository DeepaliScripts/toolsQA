package iframe;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import edureka.formyapp;

public class secondway {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

		System.out.println(iframes.size());
		
		for (WebElement ele:iframes) {
			
			System.out.println(ele.getDomProperty("Title"));
			
		}
		
		driver.quit();
		
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.linkText("org.openqa.selenium")).click();
//		System.out.println("worked");
//		
//		driver.switchTo().defaultContent();
//		
//		int abc = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(abc);
	}

}
