package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class ScreenshotOfPortion {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.uitestpractice.com/");
		driver.manage().window().maximize();
		
		//step1 find the section of which you want the screenshot
		WebElement section = driver.findElement(By.xpath("//div[@class='container red']"));
		
		//step2 use the webelement to take the screenshot
		File src = section.getScreenshotAs(OutputType.FILE);
		
		//step3 send the screenshot to the destination. Give the name to the file
		File dest = new File("/Users/deepaligautam/Desktop/screenshot/portionscreenshot.png");
		
		//step4 : copy image to destination 
		FileUtils.copyFile(src, dest);
		
		driver.quit();
	}

}
