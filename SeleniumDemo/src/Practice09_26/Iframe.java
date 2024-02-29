package Practice09_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
		WebElement new1 = driver.findElement(By.id("bseindex"));
		
		System.out.println(new1.getText());

	}

}
