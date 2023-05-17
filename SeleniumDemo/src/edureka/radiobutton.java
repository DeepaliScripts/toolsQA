package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		driver.manage().window().maximize();
		
		WebElement radio1 = driver.findElement(By.className("form-check-label"));
		radio1.click();
		
		Thread.sleep(3000);
		
		WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radio2.click();
		
		Thread.sleep(3000);
		
		WebElement radio3 = driver.findElement(By.cssSelector("input[value='option3']"));
		radio3.click();
		
		Thread.sleep(3000);

	}

}
