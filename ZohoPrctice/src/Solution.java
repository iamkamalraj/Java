
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


//Ques2
//Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//    1. 5 if a perfect square
//    2. 4 if multiple of 4 and divisible by 6
//    3. 3 if even number
//
//And sort the numbers based on the weight and print it as follows
//
//<10,its_weight>,<36,its weight><89,its weight>
//
//Should display the numbers based on increasing order.

		int ar[] = { 10, 36, 54, 89, 12 };

		for (int i = 0; i < 5; i++) {
			if (ar[i] == 2 * 2 || ar[i] == 3 * 3 || ar[i] == 4 * 4 || ar[i] == 5 * 5 || ar[i] == 6 * 6 || ar[i] == 7 * 7
					|| ar[i] == 8 * 8 || ar[i] == 9 * 9) {
				System.out.println("<" + ar[i] + ",5>");
			} else if (ar[i] * 4 % 6 == 4) {
				System.out.println("<" + ar[i] + ",4>");
			} else if (ar[i] % 2 == 0) {
				System.out.println("<" + ar[i] + ",3>");
			}

		}
	}

}

		

