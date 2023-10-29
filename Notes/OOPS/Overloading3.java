package OOPS;
import java.util.Scanner;

import java.io.IOException;

class Hello{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {             //method overloading
		System.out.println(a+b+c);
	}
	
	
	public void kamal(int ... a1) {     //varargs
		int sum=0;
		for(int i: a1) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}

public class Overloading3 {
	public static void main (String args[])  {
		Hello h = new Hello();
		h.add(2, 3);
		h.add(2, 3 , 5);
		h.kamal(1,2,3,4,5);
//		int a = System.in.read() -48;
//		int b = System.in.read() -48;         //it can only read one character at a time. so we using Scanner class
//		int c = System.in.read() -48;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
//		int c = sc.nextInt();
//		h.add(a,b);                //delegate (giving someone else the work to do)
//		h.add(a,b,c);
		
		
		h.kamal(1,7,8,3,2,5,5,8,7,6,9,1,4);    //varagrs
		
	}
	
}
