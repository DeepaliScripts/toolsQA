package newTabNewWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.safari.SafariDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.uitestpractice.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
	}

}
