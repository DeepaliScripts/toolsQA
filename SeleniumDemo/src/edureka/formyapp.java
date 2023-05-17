package edureka;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.safari.SafariDriver;

public class formyapp {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();

		driver.get("https://formy-project.herokuapp.com/modal");

		WebElement modal = driver.findElement(By.id("modal-button"));

		modal.click();

		WebElement closebutton = driver.findElement(By.id("close-button"));

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", closebutton);

	}

}