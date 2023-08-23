import java.util.*;
//
//public class Solution {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		int N = scanner.nextInt();
//
//		if (N % 2 != 0 || (N % 2 == 0 && N >= 6 && N <= 20)) {
//			System.out.println("Weird");
//
//		} else if (N % 2 == 0 && (N >= 2 && N <= 5) || N > 20) {
//			System.out.println("Not Weird");
//		}
//	}
//}


//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        
//        int i = scan.nextInt();
//        scan.nextLine(); // get rid of empty newline char
//        double d = scan.nextDouble();
//        scan.nextLine(); // get rid of empty newline char
//        String s = scan.nextLine();
//        
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//        
//        scan.close();
//    }
//}

//public class Solution 
//{
//    public static void main(String[] args) 
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s=sc.next();
//            int n=sc.nextInt();
//            String number=String.format("%03d", n);
//            
//            String spaces = "";
//            for(int j=1; j<=(15-s.length()); j++)
//                spaces = spaces + " ";
//            
//            System.out.println(s+spaces+number);
//        }
//        System.out.println("================================");
//    }
//}	


//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=0; i<=10; i++){
//            if(1<=i && i<=10){
//                int result = N * i;
//                System.out.println(N+" " + "x" + " " + i + " = "+ result);
//                sc.close();
//            }
//        }
//    }
//}




class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int term = a;
			for (int j = 0; j < n; j++) {
				term += (Math.pow(2, j) * b);
				System.out.print(term + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
	





