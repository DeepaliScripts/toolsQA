package toolsQA;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class LoginPageAuto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		long add = Math.round(Math.ceil((Math.random())*100000));
		Actions act = new Actions(driver);
		

		
		String firstNameString = "deepali"+add;
		String firstLastString = "gautam"+add;
		String emailRand = "deepaligautam.er"+add+"  @gmail.com";
		
		long myNumberRandomlyGenerated = Math.round(Math.ceil((Math.random())*100000000));
		String newNum = "123"+myNumberRandomlyGenerated;
		
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstNameString);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(firstLastString);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(emailRand);
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		js.executeScript("arguments[0].click()", gender, 632, 584);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(newNum);
		WebElement date = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		
		
		js.executeScript("arguments[0].scrollIntoView()", date);
	
		js.executeScript("arguments[0].click()", date, 632, 584);
		
		driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
		
		WebElement box = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		box.click();
		
		box.sendKeys("Maths");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		box.sendKeys("English");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		js.executeScript("arguments[0].scrollIntoView()", date);
		
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		js.executeScript("arguments[0].click()", hobbies);
		
		
		String address = "ska greenarch\nnoida society\nIndia\nOn earth";
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(address);
		WebElement opt1=
		driver.findElement(By.xpath("//div[@id='state']"));
		js.executeScript("arguments[0].scrollIntoView()", opt1);
		
		opt1.click();
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		WebElement opt2=driver.findElement(By.xpath("//div[@id='city']"));
		
		opt2.click();
		act.sendKeys(Keys.ENTER).build().perform();
		//js.executeScript("arguments[0].click()", opt1,602,664);
		//act.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(3000);
		WebElement closeBtn=
		driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
		js.executeScript("arguments[0].click()", closeBtn,1005,658);
		
		System.out.println("end of program");
		
	}

}
