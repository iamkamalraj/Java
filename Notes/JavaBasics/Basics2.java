package JavaBasics;

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
//		int x=60;
//		String result = x<18?"Not Eligibe":"Eigible";
//		System.out.println(result);
		
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
		
		int salary = 40000;
		String kamalSalary = salary<=50000?"un satisfied":"satisfied";
		System.out.println(kamalSalary);
		
//		switch case
		int y=1;       // 1.box  2.name(y)  3.inside(50)
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
			System.out.println("Invaild Number");
		}
		
		int kamal=0;
		switch(kamal) {
		case 23:
			System.out.println("its a 23");
			break;
		case 99:
			System.out.println("its a 99");
			break;
		case 101:
			System.out.println("its a 101");
			break;
		default:
			System.out.println("its a default value");
		}
		
		int shafwan = 3;
		switch(shafwan) {
		case 23:
			System.out.println("He is Hero");
			break;
		case 0:
			System.out.println("He is Zero");
			break;
		default:
			System.out.println("He is ordinary Boy");
		}
	}

}

