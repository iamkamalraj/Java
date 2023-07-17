

//final with class ---> no one can extend final class or we cannot inherit final class
final class A
{
	int num;
	
	
	public void increment()
	{
		num = num+1;
		
		
	}
	
}
class B extends A  // error bcz A is final 
{
	
}





public class Project6 {

	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println(obj.num);
		
		obj.increment();
		
		System.out.println(obj.num);
		

	}

}
