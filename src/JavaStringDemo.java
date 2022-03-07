
public class JavaStringDemo {

	public static void main(String[] args) {
String s = new String("you cannot");
String s1 = s.concat("change me");
String s2 = "you cannot change me";
System.out.println(s1==s2);
String s3 = "you cannot"+"change me";
System.out.println(s2==s3);

	}

}
