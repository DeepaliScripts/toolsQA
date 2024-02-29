package Practice09_26;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;


@Listeners(Practice09_26.listens.class) //test class and listener class integrated
public class annots {
	
//	@BeforeMethod
//	public static void bm () {
//		System.out.println("before method ");
//	}
//	
//	
//	@BeforeTest
//	public static void bt () {
//		System.out.println("before test");
//	}
	
	@Test
	public static void test1 (){
		System.out.println("test1 is run");
		Assert.assertTrue(true); 
	
	}
	
	@Test
	public static void test2 (){
		System.out.println("test2 is run");
		Assert.assertTrue(false); 
	}
	

}


 