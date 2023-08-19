public class Basics2 {
	public static void main (String args[]){
//		1.Arithmetic operators
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
//		2.Logical operators
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
//		3.Relational operators
		System.out.println(a>=b || a==b);
		System.out.println(a>=b && a==b);
//		Escape Sequence
		System.out.print("Hello \n");
		System.out.print("Hi \t Hahaha \n");
		
//		if-else
		int x = 60;
		String result = null;
		if(x<18)
			result = "Not Eligible";
		else if(x>=18 && x<=60)
			result = "Eligible";
		else
			result = "Not Eligible";
		System.out.println(result);
//		ternary ?:
		int z=20;
		String res = z>=18?"Allowed":"Not ALlowed";
		System.out.println(res);
//		switch case
		int y=5;
		switch(y){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesay");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Monday");
		}
	}

}