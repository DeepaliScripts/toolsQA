package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
		dropdown.click();
		
		Thread.sleep(3000);
		WebElement firstoption = driver.findElement(By.id("autocomplete"));
		
		firstoption.click();
		

	}

}
