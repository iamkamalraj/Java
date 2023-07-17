
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Alien a1=new Alien();
		
		Alien a2=new Alien();
		
		Alien.show();
		
		//static methods can be called with class name directly and can also be called using object ref
		
		//a1.show(); 
		
		

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
	
	public static void show()
	{
		System.out.println("in show");
	}
	
}