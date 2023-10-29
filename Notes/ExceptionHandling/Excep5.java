package ExceptionHandling;

import java.util.Scanner;
class Alpha1
{
	public void division() throws ArithmeticException
	{
		
		System.out.println("Welcome to Najafi tech Application ");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number to divide");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        int res=a/b;
        System.out.println("The result is "+ res);
		
        System.out.println("Thank you for using my application");
	}
}
class Beta1
{
	public void disp()
	{
		Alpha1 a=new Alpha1();
		a.division();
	}
}
public class Excep5 {

	public static void main(String[] args) {
	
		try
		{
		Beta1 b=new Beta1();
		b.disp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handling in main method");
		}

	}

}
