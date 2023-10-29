package WrapperClass;

public class Example{
	public static void main(String args[]) {
		//wrapper=> to wrap primitives just like object . it is of java.lang package
		//primitives 1.byte,short,int,long 2.float,double 3.boolean 4.char
		//almost every Wrapper class contains 2 Constructors , only char contains just primitive arguments only 
		//a, primitive type as a argument
		//b, String type as a argument
		
		int a = 7;
//		int d = "7"; //not possible
		Integer b = new Integer(7);
		Integer c = new Integer("7");
//		Integer e = new Integer("lol"); //it will throw NumberformatException because of wrong data types

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Character f = new Character('f');
//		Character g = new Character("g"); //CompileTime error
		System.out.println(f); 
		
		Boolean m = new Boolean(true); //true
		Boolean m1 = new Boolean("True"); //true
//		Boolean m2 = new Boolean(True);  //CompileTime error
		Boolean m3 = new Boolean("tRuE"); //true
		Boolean m4 = new Boolean(false);  //false
		Boolean m5 = new Boolean("False"); //false
		Boolean m6 = new Boolean("Yes");  //false
		Boolean m7 = new Boolean("no");  //false
		Boolean m8 = new Boolean("Shafwan"); //false
		
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		System.out.println(m7);
		System.out.println(m8);
		
		//two methods of object class used in wrapper class
		//1.String toSring() => JVM will always call toString() When we try to print any reference variable.
		//reference variable can be 1. inbuilt class 2. user defied class
		//2.equals(Object obj)
	}
}