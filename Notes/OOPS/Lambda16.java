package OOPS;
	
interface Computer{
	void show();
}
interface Laptop{
	int add(int a,int b);
}

public class Lambda16 {
	public static void main(String args[]) {
		
//	Computer c = new Computer() {                  // ---
//		public void show() {                       //    |
//			System.out.println("in show 1");       //    - normal Anonymous inner class
//		}                                          //    |
//	};                                             // ---
//	c.show();
	
	Computer c =()->System.out.println("in show ");
	c.show();
	
	Laptop l = (a,b)->a+b;
	System.out.println(l.add(4,7));
}
} 
