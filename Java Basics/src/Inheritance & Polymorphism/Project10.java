
class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	
	public void show()
	{
		System.out.println("in C show");
	}
}





public class Project10 {

	public static void main(String[] args) 
	{
		
		int i=9;
		
		A obj =null;    // Multiple Behavior  Poly morphic Polymorphism 
		
		if(i%2==0)
			obj=new B();
		else
			obj=new C();
		
		
		
		obj.show();
		
	}

}
