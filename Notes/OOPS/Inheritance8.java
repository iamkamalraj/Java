package OOPS;

class A{                   //super      //By default , it extends the Object class
	public void show(){
		System.out.println("Lol");
	}
}
class B extends A{         //sub      //single inheritance
	
}

//------------------------------------ 

class First{
	int i=7;                       //super
}

class Second extends First{
	int i=5;
	void run() {
		int i=3;                    //sub
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

//---------------------------------------
//Every Constructor by default having super() method 

class X{
	public X() {
		System.out.println("in x");
	}
	public X(int x) {
		System.out.println("in x int");
	}
}
class Y extends X{
	public Y() {
		                               //super();  by default having
		System.out.println("in y");
	}
	public Y(int x) {
		super(23);
		System.out.println("in y int");
	}
}

//------------------------------------------

//types of methods
//inherited methods , overridden methods , specialized methods.... below example
class Parent{
	int height = 6;
	char bloodGroup = 'b';
	String color = "White";	
	String habit = "Good";
	String dress ="White";
}
class Child extends Parent{
	String color = "Dark";
	String habit = "Bad";
	String freeTime = "Waste";
	int marks = 0;
	void show() {
		System.out.println(height);            //inherited
		System.out.println(bloodGroup);        //inherited
		System.out.println(color);             //overridden
		System.out.println(habit);             //overridden
		System.out.println(freeTime);          //specialized
		System.out.println(marks);             //specialized
	}
}
//-------------------------------------------

public class Inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		b.show();
//		
//		Second s = new Second();
//		s.run();
//		
//		Y y = new Y();
//		Y y1 = new Y(0);
		
		Parent c = new Child();
		System.out.println(c.bloodGroup);
		System.out.println(((Child)c).marks);
//		c.show();
		
		
		
	}

}




