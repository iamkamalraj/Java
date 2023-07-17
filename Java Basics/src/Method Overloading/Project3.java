

class A
{
	int num;
	public A()
	{
		System.out.println("in A");  //constructor overloading
	}
	
	public A(int i)
	{
		System.out.println("in A int ");
		num=i;
		
	}
}





public class Project3 {

	public static void main(String[] args) 
	{
		A obj=new A(7);
		System.out.println(obj.num);
		

	}

}
