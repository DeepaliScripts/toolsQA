package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class JavaScriptExecutor {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Index");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//enter text in the box
		js.executeScript("document.getElementById('Search_Data').value='Aliya';");
		
		//click on find button
		WebElement sub = driver.findElement(By.xpath("//input[@value='Find']"));
		js.executeScript("arguments[0].click();", sub);
		
		//refresh the browser
		//js.executeScript("history.go(0)");
		
		//return the domain name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println(domain);
		
		//get the title of the page
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//get the URL of the page
		String urlurl = js.executeScript("return document.URL;").toString();
		System.out.println(urlurl);
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("alert('Alert message');");
		
		js.executeScript("window.location = https://google.co.in");

	}

}
