
import java.util.Scanner;

class Addition{
	public int add(int ... nums)	// we are not Assigning any size. This is VarArgs .. Even if we pass 10 values also 3 dots
	{
		int sum = 0;
		for(int i : nums)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class VarArgsDemo {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number = ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second Number = ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third Number = ");
		int c = sc.nextInt();
		
		System.out.println("Enter the fourth Number = ");
		int d = sc.nextInt();
		
		
		Addition obj1 = new Addition();
		int result = obj1.add(a, b , c , d);		// for this above varArgs is used 
		
		System.out.println("The answer is = " + result);
	}
}