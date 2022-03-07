
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "level";
StringBuffer sb = new StringBuffer(s);
sb.reverse();
String rev = sb.toString();
System.out.println(rev);
if(s.equals(rev))
{
	System.out.println("it is palindrome");
}
else {
	System.out.println("not a palindrome");
}
	}

}
