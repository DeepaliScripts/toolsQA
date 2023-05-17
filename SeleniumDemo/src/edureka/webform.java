package edureka;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;






public class webform {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.click();
		firstname.sendKeys("KANISHK");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.click();
		lastname.sendKeys("GARG");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement jobtitle = driver.findElement(By.id("job-title"));
		jobtitle.click();
		jobtitle.sendKeys("automation engineer");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement radiobutton = driver.findElement(By.id("radio-button-3"));
		radiobutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement checkbox = driver.findElement(By.id("checkbox-2"));
		checkbox.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement menu = driver.findElement(By.id("select-menu"));
		menu.click();
		menu.sendKeys(Keys.ARROW_DOWN);
		menu.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement datemenu = driver.findElement(By.id("datepicker"));
		datemenu.click();
		datemenu.sendKeys("04/27/2023");
		datemenu.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[8]/a"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
		
		String alertext = text.getText();
		
		if ("The form was successfully submitted!".equals(alertext));{
			System.out.println(alertext + "text exists");
		}
		

	}

}
