package OOPS;

@FunctionalInterface               //so that no one can make any methods in the interface , if they means it'll be not FI..so
interface First23{
	void disp();                   //only one abstract method, so we called as Functional Interface
}

//class Second23 implements First23{
//	public void disp() {
//		System.out.println("Implementing through Functional Interface");
//	}
//}

public class Fi14 {
	public static void main(String args[]) {
//		Second23 f = new Second23();
		
		
//		First23 f = new First23() {
//			public void disp() {
//				System.out.println("Implementing through Annonymous Inner Class");
//			}
//		};
//		f.disp();
		
		First23 f = ()->System.out.println("Implementing through Annonymous Inner Class");
		f.disp();
	}

}
 