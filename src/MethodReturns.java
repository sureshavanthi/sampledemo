
public class MethodReturns {

	public int addition(int a , int b)
	{
		int result=a+b;
		return result;
	}

	public static void main(String[] args) {
	MethodReturns d = new MethodReturns();	
	System.out.println(d.addition(10,30));
	System.out.println(d.addition(10,10));
	int output = d.addition(20,30);		
	System.out.println(output);	
	}
	
	
}
