package testNGDemo;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class TestNGXML {
	
	@Test (priority = -1)
	public void test1() {
		System.out.println("test case 1");
	}
	
	@Test (priority = -2)
	public void test2() {
		System.out.println("test case 2");
	}

}
