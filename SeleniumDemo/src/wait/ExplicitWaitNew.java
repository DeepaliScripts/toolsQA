package wait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWaitNew {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		Stopwatch watch = null;


		try {
			watch = Stopwatch.createStarted();
			//wait for 10 seconds
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			ele.click();
			System.out.println("test passed");
		}

		catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS));

		}

		driver.quit();

	}

}
