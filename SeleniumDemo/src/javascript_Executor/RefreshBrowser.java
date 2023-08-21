package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class RefreshBrowser {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.uitestpractice.com/Students/Index");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");

	}

}
