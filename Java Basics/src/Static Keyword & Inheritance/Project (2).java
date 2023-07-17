
public class Project {

	public static void main(String[] args)
	{
		
		Alien a1=new Alien();
		
		Alien a2=new Alien();
		
		
		a1.age=15;
		a1.name="Navin";
		
		
		//a1.tech="Java";
		
		Alien.tech="Java";
		
		
		a2.age=31;
		a2.name="Harsh";
		
		//a2.tech="Blockchain";
		
		//static variables can be accessed using class name directly 
		
		Alien.tech="Blockchain";
		
		/*
		 * System.out.println(a1.age); //15
		 *  System.out.println(a2.age);//31  
		 */
		
		System.out.println(a1.tech);// Blockchain
		//or
		// System.out.println(Alien.tech);// Blockchain
		
		System.out.println(a2.tech);//Blockchain
		
		// System.out.println(Alien.tech);// Blockchain
		
		//static variables data will be common for all the objects
		
		
	}

}

class Alien
{
	
	int age;
	String name;
	
	static String tech;
	
	public Alien()
	{
		System.out.println("In Constructor");
	}
	
}
