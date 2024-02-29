package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import edureka.formyapp;



public class GoogleSearch {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("/Users/deepaligautam/Desktop/city.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int lastRow = sheet.getLastRowNum();

		for (int j=1; j<=lastRow; j++) {
			WebDriver driver = new SafariDriver();
			String url1 = "https://www.google.co.in/";
			driver.get(url1);
			driver.manage().window().maximize();
			WebElement textbox = driver.findElement(By.name("q"));
			WebElement btn = driver.findElement(By.name("btnK"));
			
			String city = sheet.getRow(j).getCell(0).getStringCellValue();
			
			textbox.sendKeys(city);
			textbox.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.quit();
		}
	}

}
