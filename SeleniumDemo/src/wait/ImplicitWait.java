package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Stopwatch watch = null;


		try {
			watch = Stopwatch.createStarted();
			driver.findElement(By.linkText("START 2SELLING"));
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
