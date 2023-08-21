package uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Uploadfile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Thread.sleep(5000);
		button.sendKeys("/Users/deepaligautam/Desktop/wp8888989.jpeg");
		
		
		
		

	}

}
