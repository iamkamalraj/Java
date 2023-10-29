package ExceptionHandling;
import java.util.Scanner;
public class Example {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
//		try {
//			int a=sc.nextInt();
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println(c);
//		}
//		catch(Throwable E){                               //Throwable is the parent type of all Exceptions
//			System.out.println("Divisor Cannot be Zero");
//		}
//		finally {
//			System.out.println("Thankyou");
//		}
		// There Many types of exceptions like ArrayIndexOutOfBoundsException,ArithmeticException,NegativeArraySizeException
		
		// There can be 1 try and multiple catch block but multiple try blocks is not possible
		//there can not be only try or catch or finally
//		try {
//			System.out.println("lol");
//		}
//		catch(ArrayIndexOutOfBoundsException E){
//			System.out.println("Lol");
//		}
//		catch(NegativeArraySizeException j){
//			System.out.println("Lol");
//		}
//		catch(Exception k){
//			System.out.println("Lol");
//		}
		//if Caller calls the method of Exception codes then exception can be handled in either in of the Classes
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Throws keyword is used for Ducking a Exception , used in Checked Exception
		//or we indicating to who and all calling to this method that there's a possibility for occuring exceptions
		//EX: Excep6.java
		//throw keyword is used for re throwing the exception to the caller methods
		//EX: inside catch block 'throw E'
		
		//finally vs return => finally will dominate the return
		//that is even though there was a return in the code , still the finally block will be executed
		
//		try {
//			System.out.println("try");
//			int h =9;
//			System.out.println(h/0);
//			return;
//		}
//		catch(Exception e){
//			System.out.println("Catch");
//		}
//		finally {
//			System.out.println("Okay");
//		}
		
		//system.exit vs return => system.exit will dominate the finally
		//that is even though there was a finally block in the code , still the system.exit will end the program
		
//		try {
//			System.out.println("try");
//			int h =9;
//			System.out.println(h/0);
//		}
//		catch(Exception e){
//			System.out.println("Catch");
//			System.exit(0);
//		}
//		finally {
//			System.out.println("Okay");
//		}
		
		//methods to print exception information
		//1.getMessage() => prints the description of the exceptions
		//Ex: / by Zero
		//2.toString() => print the name and description of the exception
		//EX: ArithmeticException: / by Zero
		//3.e.printStackTrace => print the name and description of the exception along with the stack trace
		//EX: java.lang.ArithmeticException: / by zero at ExceptionHandling.Main.main(Main.java:85)
		
//		try {
//			int num=5/0;
//		}
//		catch(Exception e) {
//			System.out.println("Exception Handled");
//			System.out.println(e);  //works like e.toString()
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//		}
		
		//we can also throw a exception without using try catch block
//		throw new ArithmeticException("/ by Zero");  
//		throw new Launch(); //only valid when Launch class extends any Exception 
		
		//without any exceptions in the code , still its possible to duck unchecked exceptions EX: add()throws ArithmeticException  (no error)
		//but without any exceptions , its not possible to duck a checked Exception E: add()throws IOException (error)
		
		//inside try,catch,finally , we can also write any number of try catch finally
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//user defined exceptions
		
		//try with resources
		//when there is some files inside try block.. by the time of executing , it will run and it will not close the file
		//but when we write inside try with resources means after executing try block , it will close the files
//		EX:try(resource){ }
		//before this try(resources) features which is JDK 1.7 , we were using finally block for closing the files
		//so after 1.7 we can also only use try(resoure) block
	}
}
