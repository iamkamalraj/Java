
public class Project7 {

	public static void main(String[] args)
	{
		int num1,num2;
		
		num1=7;
		num2=5;
		
		UltraCalc c1=new UltraCalc();
		
		int result=c1.add(num1, num2);
		int result1=c1.sub(num1, num2);
		int result2=c1.mul(num1, num2);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}

}

class Calc
{
	
	public  int add(int num1 , int num2)
	{
		return num1 + num2;
	}
}

class Calc1 extends Calc
{
	
	
	public int sub(int num1 , int num2)
	{
		return num1 - num2;
	}
}


//multilevel inheritance
class UltraCalc extends Calc1
{
	public int mul(int num1, int num2)
	{
		return num1 * num2;
	}

}
