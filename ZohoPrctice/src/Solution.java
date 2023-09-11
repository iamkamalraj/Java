
public class Solution {

	public static void main(String args[]) {

		
//Ques1
//		1. Print the word with odd letters as
//
//		P         M
//		 R      A
//		   O  R
//		     G
//		  O    R
//		 R       A
//		P          M 
		

		String arr[] = { "p", "r", "o", "g", "r", "a", "m" };
		int n = 8;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i == j || i + j == n - 1 / 2)
					System.out.print(arr[j - 1]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
}

		

