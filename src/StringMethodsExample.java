
public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using string literal//
		String s = "kartik";
String s1 = new String("kartik");
String s2 = "kartik";
String s3= "Pranav";
String s4 = "Pranavi";
String s5 = "pranavi";
String s6 = "   avanthi";
//string method examples//
System.out.println(s.equals(s1));
System.out.println(s3.compareTo(s4));
System.out.println(s==s1);
System.out.println(s4.equalsIgnoreCase(s5));
System.out.println(s3 + " " + s2);
System.out.println(s.concat(s3));
System.out.println(s.substring(2));
System.out.println(s3.substring(1, 3));
System.out.println(s.startsWith("k"));
System.out.println(s2.charAt(2));
System.out.println(s6.trim());
System.out.println(s4.contains("ana"));
System.out.println(s2.toUpperCase());
	}
}
