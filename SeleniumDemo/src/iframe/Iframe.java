package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Iframe {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("moneyiframe");
		
		String givevalue = driver.findElement(By.id("NseChange")).getText();
		System.out.println(givevalue);

	}

}
