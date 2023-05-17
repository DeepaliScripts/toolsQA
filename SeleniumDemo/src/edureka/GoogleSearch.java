package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleSearch {

	WebDriver driver = new SafariDriver();
	
	@BeforeTest
	public void setup() {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
	}
	@Test
	public void googleSearch() {
		
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("New Delhi");
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.manage().window().minimize();
		driver.quit();
		System.out.println("test is succcessful");
		
	}
	
}
