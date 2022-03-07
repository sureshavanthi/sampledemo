package javaArr;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum(new int[] {10,20,30,40});//for anonymous array we don't specify the size//
	}
public static void Sum(int[] x)
{
	int total = 0;
	for(int x1:x)
	{
		total = total+x1;
	}
	System.out.println("the sum is "+total);
}
}
		
		
	


