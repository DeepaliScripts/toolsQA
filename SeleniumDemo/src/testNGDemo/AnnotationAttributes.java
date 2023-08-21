package testNGDemo;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class AnnotationAttributes {
	
	@Test(description="testcase1 it is")
	public void testCase1() {
		System.out.println("Mobile login testcase");
	}
	
	@Test(description="testcase2 it is")
	public void testCase2() {
		System.out.println("Web login testcase");
	}
	
	@Test(description="testcase3 it is")
	public void testCase3() {
		System.out.println("API login testcase");
	}


}
