package javaArr;

public class FindMinArrayElement {	
	

	//finding the minimum element in an array//	

	
public void min(int [] arr)
{
int min = arr[0];
for(int i=1;i<arr.length;i++)
{
	if(min>arr[i]) {
		min = arr[i];
	}
}
System.out.println(min);
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int []arr = {33,4,1,6};
FindMinArrayElement f = new	FindMinArrayElement();
f.min(arr);

	}

}
