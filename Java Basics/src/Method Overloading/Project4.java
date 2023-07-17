

class A
{
	int num;
	
	public void increment()
	{
		num = num+1;
	}
	
}





public class Project4 {

	public static void main(String[] args) 
	{
		A obj=new A();
		System.out.println(obj.num);
		
		obj.increment();
		
		System.out.println(obj.num);
		

	}

}
