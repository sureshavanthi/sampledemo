package javaexception;

public class TryWithMultipleCatches {

	public static void main(String[] args) {
		try {
			
			int a[] = new int[5];
			a[5] = 10;
		}
		
		catch (ArithmeticException e) {
		System.out.println("arithmetic exception");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException");
		}
		catch(Exception e) {
		System.out.println("Exception");	
		}
		
		System.out.println("rest of the code");	
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


