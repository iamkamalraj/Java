import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the any Word to veriy it is Palindrome or Not \n");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		
		String s2="";
		
		
		for(int i=s1.length()-1;i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");      //KAMAK // ABCBA
		}
		else
		{
			System.out.println("Not palindrome");  //KAMALRAJ
		}


	}

}
