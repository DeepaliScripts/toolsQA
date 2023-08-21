package iframe;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondway {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		System.out.println("worked");
		
		driver.switchTo().defaultContent();
		
		int abc = driver.findElements(By.tagName("iframe")).size();
		System.out.println(abc);
	}

}
