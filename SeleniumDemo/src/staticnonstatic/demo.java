package staticnonstatic;

public class demo {

	public static void main(String[] args) {
		

	}
	
	public static void methodA () {
		methodB();
	
	}
	
	public static void methodB () {
		methodA();
	}	
	
	public void methodC () {
		methodA();
		methodB();
		
	}	
	
	public void methodD () {
		methodC();
	}

}

class bike {
	
	public static void methodD () {
		demo.methodA();
		
		demo bmw = new demo();
		bmw.methodC();
		
	}
	
	
}