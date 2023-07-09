
class Telusko
{
	private String name;
	private int age;
	
	Telusko()
	{
		System.out.println("Parent class");
	}
}
class Alien9 extends Telusko
{
	
	Alien9()
	{
		System.out.println("Child class");
	}
}




public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien9 a=new Alien9();
		

	}

}
