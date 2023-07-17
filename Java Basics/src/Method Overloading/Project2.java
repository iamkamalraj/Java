

class A
{
	public int add(int num1,int num2)  //Method overloading
	{
		return num1+num2;
	}
	
	public int add(int num1,int num2, int num3)
	{
		return num1 + num2 + num3;
	}
}




public class Project2 {

	public static void main(String[] args) 
	{
		A obj=new A();
		int result=obj.add(5,7);
		int result1=obj.add(5,7,9);
		
		System.out.println(result1);

	}

}
