package Practice09_26;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGprc {
	
	@BeforeSuite
	public void BS() {
		//here we can do database connections, or 
		System.out.println("BEFORE SUITE");
		
	}
	
	
	@BeforeTest
	public void BT() {
		//this will run only once so we can here create instance of webDriver
		System.out.println("would run before all the test are to be run");
		
	}
	
	@BeforeClass
	public void BC() {
		//can do class specific work like initialisations
		System.out.println("this is before class");
		
	}
	
	
	@BeforeMethod
	public void BM() {
		//we can launch a browser before each test 
		System.out.println("this is before method");
		
	}
	
	@Test
	public void nametest1() {
		System.out.println("this is a sample test 1");
	}
	
	@Test
	public void nametest2() {
		System.out.println("this is a sample test 2");
	}
	
	
	@AfterMethod
	public void AM() {
		//close the browser after each test 
		System.out.println("this is After method");
		
	}
	
	@AfterClass
	public void AC() {
		System.out.println("this is after class");
		
	}
	
	@AfterTest
	public void AT() {
		//here we can quit all the browsers
		System.out.println("would run after all the test are to be run");
		
	}
	
	

}


class testNGprc2 {
	@BeforeClass
	public void BC() {
		System.out.println("this is before class of testNGprc2");
		
	}
	
	@Test
	public void nametest3() {
		System.out.println("this is a sample test 3");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("this is after class of testNGprc2");
		
	}
	
}
