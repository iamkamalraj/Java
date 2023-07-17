
public class Project4 {

	public static void main(String[] args)
	{
		int num1,num2;
		
		num1=7;
		num2=5;
		
		Calc c1=new Calc();
		
		int result=c1.add(num1, num2);
		
		System.out.println(result);

	}

}

class Calc
{
	
	public int add(int num1 , int num2)
	{
		return num1 + num2;
	}
}
