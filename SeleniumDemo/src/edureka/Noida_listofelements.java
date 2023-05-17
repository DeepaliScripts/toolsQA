package edureka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Noida_listofelements {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		//WebElement textbox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")); 
		//textbox.click();
		//textbox.sendKeys("new zealand");
		
		List <WebElement> number1 = driver.findElements(By.xpath("//input")); 
		int number = number1.size();
		
		System.out.print(number);

	}

}
