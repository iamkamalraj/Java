

//final with variable -->  constant

class A
{
	int num;
	
	final double pi=3.14;
	
	public void increment()
	{
		num = num+1;
		
		//pi=9.8  // error would be generated 
		
	}
	
}





public class Project5 {

	public static void main(String[] args) 
	{
		A obj=new A();
		System.out.println(obj.num);
		
		obj.increment();
		
		System.out.println(obj.pi);
		

	}

}
