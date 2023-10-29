package OOPS;
import java.util.*;
public class Array4 {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Enter the Number of Students");
//		int no = s.nextInt();
//		int []a=new int[no];      // {7,4,5,6,8}
		
		double []d= {3.5,2.3,7.8};
		System.out.println(Arrays.toString(d));
		
		String []don = {"hi","hello","lol"};
		String 
		System.out.println(Arrays.toString(don));
		
		char []ew = {'a','b','c'};
		System.out.println(Arrays.toString(ew));
		
		
//		for(int i=0;i<no;i++) {
//			System.out.println("Enter the marks of Student "+i);
//			a[i] = s.nextInt();
//		}
//		for(int i=0;i<no;i++) {
//			System.out.println("The marks of Student "+i+" is "+a[i]);	
//		}
		
		
		
//                          row column value
		int [][][]b=new int [3]   [2]   [3];      //[(1,2,3),(1,2,3)],[(1,2,3),(1,2,3)],[(1,2,3),(1,2,3)]
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				for(int k=0;k<b[i][j].length;k++) {
					System.out.println("Enter the marks of School "+i+" class "+j+" Student "+k);
				    b[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				for(int k=0;k<b[i][j].length;k++) {
					System.out.print("The marks of School "+i+" class "+j+" Student "+k +" is : "+  b[i][j][k]+" ");
				}System.out.print(" ");
			}System.out.println();
		}	
		
//		int [][][]c= {{{1,2},{2,4}},{{3,2},{3,4}}};
//		for(int i=0; i<c.length;i++) {
//			for(int j=0; j<c[i].length;j++) {
//				for(int k=0;k<c[i][j].length;k++) {
//					System.out.print(c[i][j][k]+" ");
//				}System.out.print("  ");
//			}System.out.println();
//		}
		
	}
}
