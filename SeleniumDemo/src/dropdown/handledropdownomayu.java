package dropdown;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdownomayu {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("doc 3");
	

	}

}
