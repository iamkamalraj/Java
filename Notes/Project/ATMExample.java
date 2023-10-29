package Project;

import java.util.Scanner;



//class InvalidUserException extends Exception
//{
//	InvalidUserException(String msg)
//	{
//		super(msg);
//	}
//}
//class ATM1
//{
//	private int accountNum=1111; 
//	private int password=2222;
//	private int accN;
//	private int pw;
//	
//	public void input()
//	{
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the account Number");
//		accN=scan.nextInt();
//		System.out.println("Enter the password");
//		pw=scan.nextInt();
//	}
//	public void verify() throws InvalidUserException
//	{
//		if(accountNum==accN && password ==pw)
//		{
//			System.out.println("Collect your cash");
//		}
//		else
//		{
//			/*
//			 * InvalidUserException iue=new InvalidUserException();
//			 * System.out.println("Invalid credentials"); throw iue;
//			 */
//			throw new InvalidUserException("Invalid credentials! ");
//		}
//	}
//}
//class Bank
//{
//	public void initiate()
//	{
//		ATM1 a=new ATM1();
//		try
//		{
//		
//		a.input();
//		a.verify();
//		}
//		catch(InvalidUserException e)
//		{
//			try
//			{
//				System.out.println(e.getMessage());
//	    		a.input();
//		    	a.verify();
//			}
//			
//			catch(InvalidUserException f)
//			{
//				try
//				{
//					System.out.println(f.getMessage());
//					a.input();
//					a.verify();
//				}
//				catch(InvalidUserException g)
//				{
//					System.out.println("Card is blocked TATA BYE BYE");
//				     System.exit(0);
//				}
//				
//			}
//		}
//	}
//}
public class ATMExample {

	public static void main(String[] args) {
//	Bank b=new Bank();
//	b.initiate();
		
	Shafwan.shaf();

	}						

}

//using loops

class Shafwan{
	public static void shaf(){
		int accountNum1=1111;
		int password1=2222;
		int accN1;
		int pw1;
		for(int i=0;i<3;i++) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the account Number");
			accN1=scan.nextInt();
			System.out.println("Enter the password");
			pw1=scan.nextInt();
			if(accountNum1==accN1 && password1==pw1) {
				System.out.println("Collect your cash");
				break;
			}
			else {
				if(i==2) {
					System.out.println("Card is blocked TATA BYE BYE");
					continue;
				}
				System.out.println("Invalid credentials");
				continue;
			}
		}
	}
}
