import java.util.Arrays;
public class Asort {
	public static void main(String[] args) {
  int [] arr = new int [] {34,5,2,14};
//sorting an array in ascending order
  for(int i=0;i<arr.length;i++)
   {
	for(int j=i+1;j<arr.length;j++)
	{
		int tmp = 0;
		if(arr[i]>arr[j])
		{
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		}
	}
  System.out.print(arr[i] +" ");
  }
  System.out.println();
  System.out.println(Arrays.toString(arr));
  }
	}


