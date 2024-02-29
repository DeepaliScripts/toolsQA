package Practice09_26;

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



public class prac {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file1 = new FileInputStream("/Users/deepaligautam/Desktop/city.xlsx");
		Workbook wb = new XSSFWorkbook(file1);
		Sheet sh = wb.getSheet("Sheet1");
		
		
	}

}
