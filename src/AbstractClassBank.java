
 abstract class AbstractClassBank {

AbstractClassBank(){
	System.out.println("abstract constructor");
}
void currency() {
	System.out.println("INR");
}
//abstract method ends with a semicolon
abstract int getRateofInterest();
 }


 
 class SBI extends AbstractClassBank{
	 int getRateofInterest() {
 return 7;
}
}
 
 class PNB extends AbstractClassBank{
	 int getRateofInterest() {
		 return 8;
	 }
 
 
 
 public static void main(String[] args) {
		

	 AbstractClassBank b ;
	b =	 new SBI();
	System.out.println(	"Rate of interest is" + b.getRateofInterest());
	 b = new PNB();
	 System.out.println("Rate of Interest is" +b.getRateofInterest());
			 }
		 
			
			 }
		 		
 
 
 
 
 
 
 
 