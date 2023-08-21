 package extent;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;

import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BasicExtentReport {
	
	ExtentSparkReporter htmReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		
		htmReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmReporter);
		
		//environment details
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "windows 11");
		reports.setSystemInfo("user", "deepali");
		reports.setSystemInfo("browser", "safari");
		
		//look n feel
		htmReporter.config().setDocumentTitle("Extent Report Demo");
		htmReporter.config().setReportName("Test Report");
		htmReporter.config().setTheme(Theme.STANDARD);
		htmReporter.config().setTimeStampFormat("DD/MM/YYY");
	}
	
	@Test
	public void LaunchBrowser() {

		test = reports.createTest("Launch Browser and Open URL");
		Assert.assertTrue(true); //test passed
		
	}
	
	@Test
	public void verifyTitle() {

		test = reports.createTest("verify title");
		Assert.assertTrue(false); //test failed
		
	}
	
	@Test
	public void verifyLogo() {

		test = reports.createTest("verify logo");
		Assert.assertTrue(true); //test passed
		
	}
	
	@Test
	public void verifyemail() {

		test = reports.createTest("verify email");
		throw new SkipException("skipping this test case with exception");
	}
	
	@Test
	public void verifyusername() {

		test = reports.createTest("verify username");
		Assert.assertTrue(true); //test passed
	}
	
	@AfterMethod
	public void gettestresult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAIL ", ExtentColor.RED));
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASS ", ExtentColor.GREEN));
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIP ", ExtentColor.YELLOW));
		}
		
	
		
	}
	
	@AfterTest
	public void tearDown() {

		reports.flush();
	}	

}
