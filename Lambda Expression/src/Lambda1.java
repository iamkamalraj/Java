//Lambda expression '->' this is symbol 
//it is an Anonymous method any name to it which is the implementation of functional Interface
// It is used only on functional Interface //Used in only one method


interface Mobile
{
	void show (int num1,int num2);
}

public class Lambda1 {

	public static void main(String[] args) {

		
//		Mobile mob = new Mobile ()				//In Lambda only parameter here ()
		
//				{					//Removing these 3 lines 
//			public void show (int num1)			//
//			{						//
		
//				System.out.println(" in Show " + num1);
//			}
			
									//Lambda Expression
//	Mobile mob =  num1 -> System.out.println(" in Show " + num1);
//	for one variable we can put num1 without bracket but for two we should use
		
		Mobile mob =  (num1,num2) -> System.out.println("in Show " + num1 + "  " + num2);
		
	mob.show(6, 9);
	
	}
}

