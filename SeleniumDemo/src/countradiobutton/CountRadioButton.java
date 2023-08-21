package countradiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.manage().window().maximize();
		
		List <WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		System.out.println(radiobutton.size());

	}

}
