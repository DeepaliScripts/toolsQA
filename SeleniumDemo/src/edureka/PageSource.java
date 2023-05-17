package edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

public class PageSource {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
		
		String text = driver.getPageSource();
		
		if (text.contains("A paragraph of text1"))
		{
			System.out.println("title does exists");
		}
		else {
			System.out.println("title does not exists");

	}

}
	}
