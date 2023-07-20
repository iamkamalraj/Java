import java.util.Scanner;

class Farmer
{
	private float pa;			//principal amount
	private float td;			//time duration
	private float si;			//simple interest
	private static float ri;	//Rate of interest
	// static variables are also called as class variables
	
	static
	{
		ri=2.5f;
	}

	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly Enter Loan Amount Needed");
		pa=scan.nextFloat();
		System.out.println("Kindly Enter Time period to pay");
		td=scan.nextFloat();
	}
	
	void compute()
	{
		si=(pa*td*ri)/100;
	}
	
	public void disp()
	{
		System.out.println("Simple Intrest is " + si);
	}
}


public class StaticFarmer {

	public static void main(String[] args) {
		
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		
		f1.acceptInput();
		f1.compute();
		f1.disp();
		
		f2.acceptInput();
		f2.compute();
		f2.disp();
		
		
	}

}
