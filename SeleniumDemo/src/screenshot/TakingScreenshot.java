package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		SafariDriver driver = new SafariDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.manage().window().maximize();
		
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		TakesScreenshot screenshot = driver;
		
		//step2 : call getScreenshotAs method to create image file
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("/Users/deepaligautam/Desktop/screenshot/fullpage.png");
		
		//step3 : copy image to destination 
		FileUtils.copyFile(src, dest);
		
		
	}

}
