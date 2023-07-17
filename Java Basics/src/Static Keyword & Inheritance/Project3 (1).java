
public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien.show();
		
		Alien a1=new Alien(); 
		a1.show1(); // to call non static method we need to use ref name // directly with class name we cannot access
		

	}

}
class Alien
{
	
	
	public static void show()
	{
		System.out.println("in show");
	}
	
	public void show1()
	{
		System.out.println("in show1");
	}
	
}
