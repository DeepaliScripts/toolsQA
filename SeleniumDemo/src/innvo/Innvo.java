package innvo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Innvo {
	
	@Test(invocationCount = 5)
	public void testMethod1 (ITestContext context) {
		int currentInnvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("executing " + currentInnvocation);
		System.out.println("deepali");
	}
	
	@Test(invocationCount = 0)
	public void testMethod2 () {
		System.out.println("gautam");
	}

}
