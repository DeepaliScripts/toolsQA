package testNGDemo;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProvider {
	
	@org.testng.annotations.DataProvider(name = "searchDataSet")
	public Object[][] searchData()
	{
		Object[][] searchKeyword = new Object[3][2];
		searchKeyword[0][0] = "India";
		searchKeyword[0][1] = "QutubMinar";
		
		searchKeyword[1][0] = "Agra";
		searchKeyword[1][1] = "Taj Mahal";
		
		searchKeyword[2][0] = "Hyderabad";
		searchKeyword[2][1] = "Charminar";
		
		return searchKeyword;
	}

	@Test(dataProvider = "searchDataSet" )
	public void TestCaseGoogleSearch(String country, String monument) {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		WebElement searchbox = driver.findElement(By.id("q"));
		searchbox.sendKeys(country + " " + monument);

		driver.findElement(By.id("btnK")).submit();


	}}
