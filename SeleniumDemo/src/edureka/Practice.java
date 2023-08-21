package edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Practice {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();
		driver.get("formy-project.herokuapp.com/radiobutton");

	}

}

