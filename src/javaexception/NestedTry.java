package javaexception;

public class NestedTry {

	public static void main(String[] args) {
		

		try {
			try {
			System.out.println("trying to divide");
			int a = 30/0;
			}
			catch(ArithmeticException a)
			{
			System.out.println("ArithmeticException");}
			try {
				String s = null;
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
			System.out.println("NullPointerException");
			}

		System.out.println("other statement");	
		}	
			
		catch(Exception e)	{
			System.out.println("exception handled");
		}						
			
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


