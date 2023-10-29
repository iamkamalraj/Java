package OOPS;
import java.util.Scanner;

//Interface means => blueprint of class (requirement Specification)
//using interface we can achieve 100% of abstraction
//example of interface is , if boss give work to perform addition and subtraction to 3 members means
//those three will write the code with their own logic and they'll give they'll own method names
//like one will give add sub another will give sum difference like that. so it will became hard to remember names
//so using interface boss will give the name as add and sub in common(it says as standarization) and tell to use their own logics

interface Calci{    
	void add();      //by Default, it'll be like 'public abstract void add();'
	void sub();      //we can't set as protected/default/private , it will be public only  by default itself
}
class MyCalci1 implements Calci{ 
	public void add() {             // we are overridding it so, it should be public only as the parent was public
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the First Number to Add");
		int a = s.nextInt();
		System.out.println("ENter the Second Number to Add");
		int b = s.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	public void sub() {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the First Number to Sub");
		int a = s.nextInt();
		System.out.println("ENter the Second Number to Sub");
		int b = s.nextInt();
		int c = a-b;
		System.out.println(c);
	}
}
class MyCalci2 implements Calci{
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
}
class Cal{
	void permit(Calci ref) {
		ref.add();
		ref.sub();
	}
}

public class Interface13 {
	public static void main (String args[]) {
		MyCalci1 m1 = new MyCalci1();
		MyCalci2 m2 = new MyCalci2();
		Cal c = new Cal();
		c.permit(m1);
		c.permit(m2);
		
//		Cali c1 = new Calci();  //we cannot make objects of interface
		
		 Telusko.show();
		
	}
}
//while in inheritance , multiple inheritance is not Allowed because it leads to ambuigity or diamond shaped problem
//interface allows multiple inheritance.. which is one class can implements with multiple interface. ex:
interface Lo{
	void ll();                // when there's only one abstract method in a interface , we called as Functional Interface
}
interface Loll{
	void kk();
}
interface Lolll{
	void jj();
}
class Men implements Lo,Loll,Lolll{
	public void ll() {}
	public void kk() {}
	public void jj() {}
}
//we can extend and implement at the same time. ex:
class Women extends Men implements Lo {       // first extends then implements
	public void ll() {
		
	}
}
//one interface cannot implement another interface
//one interface can extends another interface
interface A6{
	void a();
}
//interface B implements A{
//	void b();                         //will throw error
//}
interface B6 extends A6{
	int a=10;            // by default interface variable will be 'public static final'
	void b();
}
//we can have marker interface or tagged interface (empty interface), Ex:
interface D{
	
}
//interface can have method with body while using the default method. Ex:
interface G{
	void f();
	default void g() {
		System.out.println("ok");
	}
}
class H1 implements G{
	public void f() {}
	                  // now it's not compulsory to give body of g() also because interface has itself have given the body for g() so..
	                  // still if we gave the body means , it will override
	                  // but without giving body for g() also we can ue g() method from class H like h.g();
}

//
interface Telusko
{
	void disp();
	//Java 8
	static void show()
	{
		System.out.println("Iam static method of an interface");
	}
	//Java 9
	
	private void shock()
	{
		System.out.println("I m private");
	}
}


