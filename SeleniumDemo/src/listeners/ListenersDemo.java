package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" successful");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" not successful");
		
	}

	
}
