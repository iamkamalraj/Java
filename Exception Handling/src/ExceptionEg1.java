
import java.util.Scanner;

public class ExceptionEg1 
{

	public static void main(String[] args) 
	{
		try
		{
		System.out.println("Welcome to division performing application");
       		Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the first Number to divide");
	        int a=scan.nextInt();
	        System.out.println("Enter the second number");
	        int b=scan.nextInt();
	        int res=a/b;	//Exception Occur when denominator is Zero by going to Default exception Handler if thre is no user defined exceptions (try and catch)
	        System.out.println("The result is "+ res);
		}
		catch(Exception e)
		{
			System.out.println("Please provide non zero denominotor");
		}
		 System.out.println("Thank you for using our application");  
        
	}
}
