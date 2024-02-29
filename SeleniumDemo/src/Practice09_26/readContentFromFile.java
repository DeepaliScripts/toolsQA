package Practice09_26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import edureka.formyapp;


public class readContentFromFile {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("/Users/deepaligautam/Desktop/city.xlsx");
		Workbook givenFile = new XSSFWorkbook(file);
		Sheet findSheet = givenFile.getSheet("Sheet1");
		
		for(int i=1; findSheet.getLastRowNum()>=i; i++) {
			
			WebDriver driver = new SafariDriver();
			driver.get("https://www.bing.com");
			driver.findElement(By.id("sb_form_q")).click();
			String cityString =
			findSheet.getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.id("sb_form_q")).sendKeys(cityString);
			
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
			
			driver.quit();
			
			
			System.out.println("searched the city successfully " + cityString);
			System.out.println();
			
			

		}
		


	}

}
