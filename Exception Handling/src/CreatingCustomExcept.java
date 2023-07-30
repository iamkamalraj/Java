import java.util.Scanner;

class InvalidUserException extends Exception //Custom Exceptions creating our own Exception
{
	InvalidUserException(String msg)
	{
		super(msg);
	}
}
class ATM1
{
	private int accountNum=1111;
	private int password=2222;
	private int accN;
	private int pw;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account Number");
		accN=scan.nextInt();
		System.out.println("Enter the password");
		pw=scan.nextInt();
	}
	public void verify() throws InvalidUserException
	{
		if(accountNum==accN && password ==pw)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			/*
			 * InvalidUserException iue=new InvalidUserException();
			 * System.out.println("Invalid credentials"); throw iue;
			 */
			throw new InvalidUserException("Invalid credentials! ");
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM1 a=new ATM1();
		try
		{
		
		a.input();
		a.verify();
		}
		catch(InvalidUserException e)
		{
			try
			{
				System.out.println(e.getMessage());
			a.input();
			a.verify();
			}
			
			catch(InvalidUserException f)
			{
				try
				{
					System.out.println(f.getMessage());
					a.input();
					a.verify();
				}
				catch(InvalidUserException g)
				{
					System.out.println("Card is blocked TATA BYE BYE");
				     System.exit(0);
				}
				
			}
		}
	}
}
public class CreatingCustomExcept {

	public static void main(String[] args) {
	Bank b=new Bank();
	b.initiate();

	}

}


