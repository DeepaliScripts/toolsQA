package testNGDemo;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class AnnotationAttributesTimeOut {

//	@Test(priority=0)
	@Test(timeOut=200)
	public void testCase1() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Mobile login testcase");
	}
	
	@Test(priority=2)
	//@Test(description="testcase2 it is")
	public void testCase2() {
		System.out.println("Web login testcase");
	}

//	@Test(priority=1)
	//@Test(description="testcase3 it is")
	@Test(dependsOnMethods = "testCase1" )
	public void testCase3() {
		System.out.println("API login testcase");
	}
}