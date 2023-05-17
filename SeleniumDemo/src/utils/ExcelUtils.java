package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	//class variables
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelpath, String sheetName) {
		try {
			
		
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetName);
		
		}
		catch (Exception exp) { 
			System.out.println("excel");
		}
		
	}
	
	
	public static void main(String[] args) {
		//getRowCount();
		getCellData(0,0);
		getCellDataNumeric(1,1);
	}
	
	public static void getRowCount() {
		
		try {		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows"+rowcount);
		
		}
		catch (Exception exp) {
			

			System.out.println(exp.getStackTrace());
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			
			
		}
	}

	public static void getCellData(int rownum, int colnum) {
		
		try {
		
		String celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println(celldata);
		
		
		}
		catch (Exception exp) {
			System.out.println(exp.getStackTrace());
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());}
		}
		
		public static void getCellDataNumeric(int rowNum, int colNum) {
			
			try {
			
			double celldatanumeric = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldatanumeric);
			
			
			}
			catch (Exception exp) {
				System.out.println(exp.getStackTrace());
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
			}
		
		
		
	}
}
