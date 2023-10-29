package OOPS;
public class StaticConcept7 {
	static int a,b,c;
	static {
		System.out.println("Static Block");
		a=10;
		b=20;
		c=30;
	}
	static void disp1() {
		System.out.println("Static method disp1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	int m,n,o;          //initialize 
	{
		System.out.println("non static block");
		m=100;
		n=200;
		o=300;            //declare
		a=40;
		b=50;
		c=60;
	}
	void StaticConcept(){
		System.out.println("Constructor");
	}
	void disp2() {
		System.out.println("non static method");
		System.out.println(m);
		System.out.println(n);     //method
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
}

	public static void main(String args[]){ 
//		static=>we can acess method without creating objects,mainly used for memory management
//		static variables ex: static int a;     
//		static block ex: static a=10; 
//		static mathods ex: static void disp(){sout(a);}
//		non-static variables =>instance variables 
//		non-static block =>initialization block  
//		non-static method =>normal methods
//		System.out.println("Main Method"); //3
//		disp();
		
		System.out.println("Main Method"); //3
		disp1();
		StaticConcept7 e = new StaticConcept7();
		e.disp2();
		
	} 
	//Example1
	//static variables
//	static int a,b,c;                      //1
//	//static blocks
//	static {                               //2
//		System.out.println("Static Block");
//		a=10;
//		b=20;
//		c=30;
//	}
//	static void disp() {
//		System.out.println("Static Method");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
	//static methods cannot be overriden
}
