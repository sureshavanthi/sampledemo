
public class JavaStringReverse {

	public static void main(String[] args) {
String name = "avanthi";
int length = name.length();
String rev = " ";
for(int i=length-1;i>=0;i--)
{
	rev = rev+name.charAt(i);
}
System.out.println("the reverse string of "+name+ ":" + rev);
	}

}
