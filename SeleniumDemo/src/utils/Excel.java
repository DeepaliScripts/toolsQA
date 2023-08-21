package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		//create input stream for excel
		FileInputStream fs = new FileInputStream("/Users/deepaligautam/Desktop/Book1.xlsx");
		
		//load input stream to workbook
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		//get the sheet from the workbook
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		System.out.println(sheet.getLastRowNum());

	}

}
