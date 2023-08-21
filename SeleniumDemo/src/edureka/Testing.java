package edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Testing {
	
	WebDriver driver = new SafariDriver();
	@BeforeClass
    public  String setup() {
		
		
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/checkbox");
		String link = driver.getTitle();
		return link;
		
	}
	@Test
	public void positive() {
		String lala = setup();
		
		SoftAssert check = new SoftAssert();
		check.assertEquals(lala, "formy");
	}

}
