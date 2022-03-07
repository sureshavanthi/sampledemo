package javaArr;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {10,20,30,40};//array declaration,creation and initialization //
for(int i=0;i<arr.length;i++ )//traversing the array using for loop//
{
	System.out.println(arr[i]);
}

//for each//
for(int ele : arr)
{
	System.out.println(ele);
}	
}
}