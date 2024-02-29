package edureka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.sound.midi.Patch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import wait.ExplicitWait;

public class interview {
	//cities google search
	public static void main(String[] args) throws FileNotFoundException  {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.co.in/");
		
		WebDriverWait waitForEle = new WebDriverWait(driver, Duration.ofMillis(5000));
		waitForEle.until(ExpectedConditions.elementToBeClickable(By.id("df")));
		

	}

}
