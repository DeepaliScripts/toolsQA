package edureka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v110.audits.model.BlockedByResponseIssueDetails;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 class practice {

	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rediff.com/");
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		
		
		for(WebElement e: iframe) {
			if(e.getAttribute("id").equals("google_ads_iframe_/21677187305/Rediff_Home_728x90_ATF_IN_0")) {
				driver.switchTo().frame(e);
				
			}
		}		
	}
}


