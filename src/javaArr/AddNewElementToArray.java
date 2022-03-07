package javaArr;
import java.util.Arrays;
public class AddNewElementToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,3,5,7};
		int n = arr.length;
		int value = 9;
		int [] newArr = new int[n+1];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
			newArr[i] = arr[i];
		}
		newArr[n] = value;	
		System.out.println(Arrays.toString(newArr));		
			
		}	
		
	}


