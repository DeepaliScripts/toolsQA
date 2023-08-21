package screenshot;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class sample {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.manage().window().maximize();
		
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		TakesScreenshot screenshot = driver;

	}

}
