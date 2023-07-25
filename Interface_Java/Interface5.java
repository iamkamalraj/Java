// In Java9 We can have private method in an interface either it can be called by either default method or static methods of an interface

interface Telusko
{
	void disp();
	static void show()
	{
		System.out.println("Iam static method of an interface");
	}

	//	If there is any private method we can call within the interface only outside we cannot call
	default void shock2()
	{
		shock();
	}
	
	
	//From Java 9 we can also have private methods in an interface
	private void shock()
	{
		System.out.println("I m private");
	}
}


public class Interface5 {

	public static void main(String[] args) {
		
     Telusko.show();	// Without Creation of object
	}

}
