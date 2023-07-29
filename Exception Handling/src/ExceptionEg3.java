import java.util.Scanner;

public class ExceptionEg3 {

	public static void main(String[] args) {
		
		// Multiple try and catch for each exceptions
		
		System.out.println("Welcome to Multiple try and  multiple catch ");
        Scanner scan=new Scanner(System.in);
        try															//#1
        {
        System.out.println("Enter the first Number to divide");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        int res=a/b;
        System.out.println("The result is "+ res);
        }
        catch(ArithmeticException e)
		{
			System.out.println("oye bruh? Please enter non zero second number");
		}
        try															//#3
        {
        System.out.println("Please enter size of an array");
        int size=scan.nextInt();
        int ar[]=new int[size];
        

		
       
        System.out.println("Enter the elem to be added in ar");
        int elem=scan.nextInt();
        
        System.out.println("Enter the position at which elem has to be inserted");
        int pos=scan.nextInt();
        ar[pos]=elem;
        }

		catch(NegativeArraySizeException e)
		{
			System.out.println("ohhho Am i joke? Please be positive");
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Man? be in your limits");
		}
		catch(Exception e)
		{
			System.out.println("Please give proper input");
		}
		
        
 
        
		 System.out.println("Thank you for using our application"); 
		 
	}

}
