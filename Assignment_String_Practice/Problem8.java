import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String splchar_str;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		splchar_str = sc.nextLine();
		
		for(i = 0; i < splchar_str.length(); i++)
		{
			ch = splchar_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
	
		System.out.println("Number of Special Characters   =  " + spl);
	}
}

	