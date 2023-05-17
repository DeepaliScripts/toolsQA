package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class sendkeysnotuse {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https:google.co.in");
		
		WebElement textbox = driver.findElement(By.className("gLFyf"));
		String text = textbox.getAttribute("name");
		System.out.println(text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='new delhi'", textbox);

	}

}
