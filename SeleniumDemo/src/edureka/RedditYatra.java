package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;



public class RedditYatra {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();

		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();

		Thread.sleep(4000);

		String source_airport = "DEL";
		String destination_airport = "BOM";
		


		driver.findElement(By.id("BE_flight_origin_city")).sendKeys(source_airport);
		Thread.sleep(4000);
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys(destination_airport);
		Thread.sleep(4000);
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='custom-date-input BE_flight_origin_date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@title='Tuesday, 29 August 2023']")).click();
		driver.findElement(By.xpath("//input[@name='flight_destination_date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@title='Thursday, 31 August 2023']")).click();
		
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();

	}

}
