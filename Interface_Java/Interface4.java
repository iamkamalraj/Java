// In Java 8 Interface we can have such a method which has body which has implementation but that method must be default

// In an interface we should write default keyword not like others it automatically orders default in local interface we should add it we write a body in interface method
interface Demo1
{
	void disp();
	default void show()			// #Default Key word
	{
		System.out.println("Hello i m in interface");
	}
}

// One Interface can extend another interface but one interface cannot implement another interface 

class Alien implements Demo1
{
	public void disp()
	{
		System.out.println("implementing display");
	}
	public void show()
	{
		System.out.println("I have be overirded inchild"); //#Default Method
		
	}
}


public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Demo1 d=new Alien();
		d.disp();
		d.show();
		
	}

}
