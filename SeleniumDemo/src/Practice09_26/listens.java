package Practice09_26;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class listens implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" test executed successfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" not successful");
		
	}
	
	

}
