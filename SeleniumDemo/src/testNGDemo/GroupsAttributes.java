package testNGDemo;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class GroupsAttributes {
	
	@Test(groups="software company")
	public void infosys() {
		System.out.println("Infosys");
	}
	
	@Test(groups="software company")
	public void wipro() {
		System.out.println("wipro");
	}
	
	@Test(groups="automobile company")
	public void maruti() {
		System.out.println("maruti");
	}

	@Test(groups="automobile company")
	public void tata() {
		System.out.println("tata");
	}

}
