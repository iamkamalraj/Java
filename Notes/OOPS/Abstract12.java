package OOPS;
                                        //using abstract we can achieve 0-100% of Abstraction
abstract class An{                       // we Can't make Instantiation(Object) of an abstract class
//	abstract int a=10;                  // variables cannot be abstract
	abstract void run();
//	{
//		System.out.println("tata");     // this body is not inheriting. so we can remove this using Abstract
//	}
	void disp() {                       //In abstract class , we can have concrete method(normal method) also
	}                                   //This is the reason why we can't achieve 100% Abstraction
}
class Bn extends An{
	void run() {
		System.out.println("Bye");
	}
}
class C extends An{
	void run() {
		System.out.println("Good Bye");
	}
}
public class Abstract12 {
	public static void main(String args[]) { 
//		A a = new A();
		Bn b = new Bn();
		C c = new C();
	}
}