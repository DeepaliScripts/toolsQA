package Practice09_26;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicArrowButton;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import edureka.interview;



public class passOnlyUpperCase {

	public static void main(String[] args) throws IOException, AWTException {
		
		FileInputStream file = new FileInputStream("/Users/deepaligautam/Desktop/city.xlsx");
		Workbook wb = new XSSFWorkbook(file);
		Sheet sh = wb.getSheet("Sheet1");		
		int row = sh.getLastRowNum();
		Robot robot = new Robot();
		
		for(int i = 1; row>=i; i++) {
			
			String inp = sh.getRow(i).getCell(0).getStringCellValue();
			
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			
			System.out.println(inp);
			
			robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
			
			
			
			
		}
	}

}
