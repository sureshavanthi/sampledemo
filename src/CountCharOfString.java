
public class CountCharOfString {

	public static void main(String[] args) {
    String s = "whitebox learning";
    int count = 0;
//program to count the no. of characters in a string excluding white spaces//
    for(int i=0;i<s.length();i++){
	if(s.charAt(i)!=' ')
	{
	count++;	
	}
   }
   System.out.println(count);
	}

}
