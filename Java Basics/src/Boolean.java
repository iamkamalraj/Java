
public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num1 = 8;
		int Num2 = 7;
		
//		boolean result = Num1<Num2; // false
//		boolean result = Num1<Num2  &&  Num1!=0;  // && will both Condition are true
// 	
//		System.out.println(result);
		
		
//		We have multiple logical operators 
		
//		   &&						|| (or)						!
		
//		T T - T					T T - T						T - F
//		T F - F					T F - T						F - T	
//		F T - F					F T - T
//		F F - F					F F - F
		
		boolean result = Num1>Num2 || Num2!=0;
		
		System.out.println(result);
		
	}

}
