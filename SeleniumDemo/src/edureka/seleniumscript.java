package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new SafariDriver();
		
		//open the URL
		driver.get("https://phptravels.com/demo/");
		//maximize the window
		driver.manage().window().maximize();
		//find the first name
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("deepali");
		//find the second name
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("gautam");
		//send the business name
		WebElement businessname = driver.findElement(By.name("business_name"));
		businessname.sendKeys("new zealand");
		//send email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("deepaligautam.er@gmail.com");
		//find the numbers
		WebElement num1 = driver.findElement(By.id("numb1"));
		WebElement num2 = driver.findElement(By.id("numb2"));
		//turn them into texts from webelements
		String text1 = num1.getText();
		String text2 = num2.getText();
		//tunr them into int from strings so that additon can be taken place
		int n1 = Integer.parseInt(text1);
		int n2 = Integer.parseInt(text2);
		//add them 
		int sum = n1+n2;
		//turn them back to string so that send keys can accept strings
		String result = Integer.toString(sum);
		
		//find where you need to show the additon
		WebElement submit = driver.findElement(By.id("number"));
		
		//give the answer
		submit.sendKeys(result);
		
		WebElement karo = driver.findElement(By.id("demo"));
		karo.click();		
		
		Thread.sleep(1000);
	}

}
