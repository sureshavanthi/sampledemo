package javaexception;

public class ExceptionExample {

	public static void validate(int age)
	{
		if(age<18)
			
			throw new IllegalArgumentException("not eligible to vote");
		else	
			System.out.println("eligible to vote");
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  validate(20);
		System.out.println("welcome to vote officially");	
		
	}

}
