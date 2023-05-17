package hiddenelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Hiddenelementinteraction {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("hide-textbox")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById(\'displayed-text\').value='deepali';");
		
		
		
	}

}
