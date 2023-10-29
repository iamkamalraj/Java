package OOPS;

class Demo1{                   // final means cannot be inherited
	final int a=10;                  //final means cannot be changes the value
	void tryss() {
//		System.out.println(this.a=6);
	}
	void trys() {              //final means can  inherited but cannot be overridden
		char lol = 'b';
		System.out.println(lol);
	}
}
class Demo2 extends Demo1{
	void trys() {
		char lol = 'c';
		System.out.println(lol);
	}
}
public class FinalConcept10 {
	public static void main(String args[]) {
		Demo2 d = new Demo2();
		d.tryss();
		d.trys(); 
	}
}



