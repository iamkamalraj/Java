
public class Project3 {

	public static void main(String[] args) 
	{
		
			int num1,num2;
			
			num1=7;
			num2=5;
			
			int result=Calc.add(num1, num2);
			
			System.out.println(result);
			
			

		}
		

	}

class Calc
{
	
	public static int add(int num1 , int num2)
	{
		return num1 + num2;
	}
}
