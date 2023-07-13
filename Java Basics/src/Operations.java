
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=5;
//		a = a+1;
//		a += 1; // short hand
//		a++; // Post increment operator
//		a--; // Post decrement operator
//		++a; // pre increment operator
//		--a; // pre decrement operator
		
//		int b = a++; //ans is 5 beacuse // First it is assigning the vale to a and
		   //	then it get incremented (Post Increment)

		int b = a++ + ++a + a--; // opt is 19
//				5		7	7 = 19
		 
		
		System.out.println(b); //=19
		System.out.println(a); 
		
	}
}
