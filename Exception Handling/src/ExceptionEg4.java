import java.util.Scanner;
class Alpha
{
	public void division()
	{
		try
		{
		System.out.println("Welcome to try and catch in diff method");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number to divide");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        int res=a/b;
        System.out.println("The result is "+ res);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Enter the non zero 2nd number");
		}
        System.out.println("Thank you for using my application");
	}
}
class Beta
{
	public void disp()
	{
		Alpha a=new Alpha();
		a.division();
	}
}
public class ExceptionEg4 {

	public static void main(String[] args) {
		Beta b=new Beta();
		b.disp();

	}

}
