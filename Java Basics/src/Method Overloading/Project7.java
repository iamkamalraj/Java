

//final with method ---> We cannot override final method
class A
{
	int num;
	
	
	final public void increment()
	{
		System.out.println("Created by Navin");
		
		
	}
	
}
class B extends A  
{
	public void increment()   // error 
	{
		System.out.println("Created by Pavan");
		
		
	}
	
}





public class Project7 {

	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println(obj.num);
		
		obj.increment();
		
		
		

	}

}
