package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		//Stopwatch watch = null;
		Wait<WebDriver> wait = new FluentWait()
				.withTimeout(Duration.ofSeconds(10))
			    .pollingEvery(Duration.ofSeconds(2))
			    .ignoring(NoSuchElementException.class);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
		ele.click();


//		try {
//			watch = Stopwatch.createStarted();
//			//wait for 10 seconds
//			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
//			ele.click();
//			System.out.println("test passed");
//		}
//
//		catch (Exception e) {
//			watch.stop();
//			System.out.println(e);
//			System.out.println(watch.elapsed(TimeUnit.SECONDS));
//
//		}

		driver.quit();

	}

	private org.openqa.selenium.support.ui.FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	}


