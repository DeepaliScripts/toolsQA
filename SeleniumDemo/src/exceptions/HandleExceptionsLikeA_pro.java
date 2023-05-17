package exceptions;

public class HandleExceptionsLikeA_pro {

	public static void main(String[] args) {
	
		
		try {
			System.out.println("deepali can do it");
			int i = 0/0;
			System.out.println("she will fullfil her dreams");
		}
		
		catch(Exception exp) {
			
			System.out.println("there is some issue"+ exp.getMessage());
		
		}
		
		finally {
			
			System.out.println("this will get printed no matter what lol");
		}
		
	}

}
