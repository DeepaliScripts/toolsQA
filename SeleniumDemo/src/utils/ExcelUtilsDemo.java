package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils("/Users/deepaligautam/linkedin/SeleniumDemo/excel/Book1.xlsx", "Sheet1");
		excel.getRowCount();
	}

}
