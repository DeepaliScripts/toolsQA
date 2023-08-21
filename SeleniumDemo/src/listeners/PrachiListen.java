package listeners;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;	

public class PrachiListen implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on testfailure method is invoked");
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("on start method is invoked" + result.getName());
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("on finish method is invoked");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on testskipped method is invoked");
	}
	
	

}
