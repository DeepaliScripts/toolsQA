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

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();
		
		WebElement box = driver.findElement(By.id("file-upload-field"));
		box.sendKeys("upload.png");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
		Thread.sleep(3000);
		button.click();
		
	
	}

}
