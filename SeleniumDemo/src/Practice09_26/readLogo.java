package Practice09_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class readLogo {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		try {
			Boolean imageCheck =
			driver.findElement(By.xpath("//img[@class='db1']")).isDisplayed();
			System.out.println(imageCheck);
			
		} catch (Exception e) {
			System.out.println("image is not displayed");
		}
		

	}

}
