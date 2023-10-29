package OOPS;
 //rules for overriding method
//1.we cannot make it more respective
//overridden should be only done when the modifier should be increasing like default to protected or private to default
//public->protected->default->private
//2.return type should not be changed which is if parent has void means child also be void
//3.return type can be different if and only if it was a co-variant return type(is a relationship)
//return types can be of primitives(void/int) or it can b objects too...example
//4.parameters should be same ex: if parent has (int x,float a) then child also should have int and float only

//polymorphisms means 1:many(1 to many) or many forms. in polymophisms we have
//compile time polymorphisms (overloading)
//run time polymorphisms (overriding)
//method hiding
class A3{
	void run() {
		System.out.println("huh"); 
	}
}
class B3 extends A3{
	void run() {
		System.out.println("lol");
	}
}



class Lol{	
}
class Doll extends Lol{	
}

class H{
	Lol run() {                        //co-variant return type
		System.out.println("lol");
		Lol l = new Lol();
		return l;
	}
}
class K extends H{
	 Doll run() {
		System.out.println("ok");
		Doll d = new Doll();
		return d;
	}
}

//-------------------------------------
class Q{
	public static void run() {
		System.out.println("hmm");
	}
}
class W extends Q{
	public static void run() {
		System.out.println("mmm");                  //it is not overriding , it's creating a new method. static cannot be overridden
	}
}

//---------------------------------------

class A0{
	void first(){
		System.out.println("Hi");
	}
	void second() {
		System.out.println("Hello");
	}
}
class B0 extends A0{
	void first() {
		System.out.println("Hi1");
	}
	void second() {
		System.out.println("Hello1");
	}
}
class C0 extends A0{
	void first() {
		System.out.println("Hi2");
	}
	void second() {
		System.out.println("Hello2");
	}
}
class D0 extends A0{
	void first() {
		System.out.println("Hi3");
	}
	void second() {
		System.out.println("Hello3");
	}
}


class Short{
	//                ('dt' a=b)
	public void permit(A0 a) {
		a.first();
		a.second();
	}
}
//----------------------------------------

public class Polymorphism9{
	public static void main (String args[]) {
//		K k = new K();
//		k.run();
//		
//		W w = new W();
//		w.run();
//		Q e = new W();                              // seeing W on Q pov
//		e.run();
		
		A0 a = new A0();
		B0 b = new B0();
		C0 c = new C0();
		D0 d = new D0();
		Short s = new Short();
		s.permit(a);
		s.permit(b);      //a=b
		s.permit(c);
		s.permit(d);
		
//		a.first();
//		a.second();
//		a=b;                              //one a with many forms
//		a.first();
//		a.second();
//		a=c;
//		a.first();
//		a.second();
//		a=d;
//		a.first();
//		a.second();
	}
}
