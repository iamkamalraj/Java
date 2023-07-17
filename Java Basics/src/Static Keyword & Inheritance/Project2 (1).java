
public class Project2 {

	public static void main(String[] args) 
	{
        Alien a1=new Alien();
		
		Alien a2=new Alien();
		
		Alien.show();
		
		System.out.println(a1.name);
		System.out.println(a1.tech);

	}

}

class Alien
{
	
	int age;
	String name;
	
	static String tech;
	
	static 
	{
		tech="Java";
		System.out.println("in static block");
	}
	
	public Alien()
	{
		name="Rahul";
		System.out.println("In Constructor");
	}
	
	public static void show()
	{
		System.out.println("in show");
	}
	
}

//class loads -  initialization-- object creation
