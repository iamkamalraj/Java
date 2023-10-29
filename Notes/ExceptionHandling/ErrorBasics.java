package ExceptionHandling;
import java.util.Scanner;
class Bol{
	public void disp() {
		disp();
	}
}

public class ErrorBasics {
	public static void main(String args[]) throws InterruptedException {
		
		//Compile Time Error (Syntax Error)
		//system.out.println("Compile time Error");        //Java code Mistakes
		
		//Run Time Error (Wrong Logic)
		//Bol b = new Bol();
		//b.disp();                                        // overflow because we're looping a method
		//int arr[]=new int[999999999];                    //out of memory error
		
		//Exceptions (Wrong Input)
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first Number");
		//int a = sc.nextInt();
		//System.out.println("Enter the second Number");
		//int b = sc.nextInt();
		//int c = a/b;
		//System.out.println("the Value is "+c);
		
		Test t = new Test(); 
		try {
			t.run();
		}
		catch(ArithmeticException e){
			System.out.println("Handled in Main Method");
		}
		
	}
}

class Test{
	void run() throws InterruptedException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first Number");
			int a = sc.nextInt();
			System.out.println("Enter the second Number");
			int b = sc.nextInt();
			Thread.sleep(5000);
			int c = a/b;
			System.out.println("the Value is "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Are you Dumb?");
			throw e;
		}
		finally {
			System.out.println("Thankyou");
		}
	}
}