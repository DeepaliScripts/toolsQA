package edureka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class sample {

	public static void main(String[] args) {
		
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https:google.co.in");



	
		
	}

}
