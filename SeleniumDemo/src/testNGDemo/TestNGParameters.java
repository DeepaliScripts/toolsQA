package testNGDemo;
import org.testng.annotations.*;

public class TestNGParameters {

	@Test
	@Parameters({"2", "3"})
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	@Test
	@Parameters({"3", "2"})
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	@Test
	@Parameters({"1", "1"})
	public void mul(int a, int b) {
		System.out.println(a*b);
	}

}
