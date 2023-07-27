interface Mobile
{
	void show (int num1,int num2);
}




public class Lambda1 {

	public static void main(String[] args) {

		
//		Mobile mob = new Mobile ()
//				{
//			public void show (int num1)
//			{
//				System.out.println(" in Show " + num1);
//			}
			
		
//	Mobile mob =  num1 -> System.out.println(" in Show " + num1);
//	for one variable we can put num1 without bracket but for two we should use
		
		Mobile mob =  (num1,num2) -> System.out.println("in Show " + num1 + "  " + num2);
		
	mob.show(6, 9);
	
	}
}

