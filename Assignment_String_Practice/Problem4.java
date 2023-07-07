import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
	
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		str1 = sc.next();
		System.out.print("Enter Second String: ");
		str2 = sc.next();

		int i, j, found=0;
		if(str1.length() == str2.length()){
			for(i=0; i<str1.length(); i++)
			{
				for(j=0; j<str1.length(); j++){
					if(str1.charAt(i) == str2.charAt(j)){
						found =1;
					}
				}
				if(found==0){
					System.out.println("Strings are not Anagram");
					System.exit(0);
				}		
			}
			System.out.println("Strings are Anagram");	
		}
		else{
			System.out.println("Strings are not Anagram");
		}
	}

}
