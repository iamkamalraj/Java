public class Basics {
	public static void main (String args[]) {
		
//Static typed programming
//when we declare the datatypes
//ex: int a=0; , double lol=11.2;

//Dynamic typed programming
//when we dont declare the data types
//ex: a=50; hah=3.12;

//datatypes
//1.primitives 2.Non primitives
//primitives are of 8 types                
//integral- byte(1b) , short(2b) , int(4b) , long(8b)
//float - float(4b) [we should write f after value] , double(8b)
//char(2b)
//boolean - true , false
//this is the reason why java is not 100% oopl because of the primitives datatypes
//
//memory management
//if we say char a ='a'; means two bytes of memory is allocated in the beck end
//because java follows the UTF(unicode transformation format) which consists of 65536 charater (2pow16)
//
//where as IN C pl 1Byte is allocated because it follows ASCII(American standard code for information interchange) ,
//ASCII has binary reprentation for 128bits consists of A-Z,a-z,0-9,!,@,#,etc
//like for a 00 , b 01 , c 10 , A 1100 , B 1101 , * 11100101
//
//java uses ascii + remaining every characters that are present... so in total 65536
//like } 1001100100110110
		
//		type casting	
//		1.implicit
//		converting one datatype to another is called as type casting
		int a=10;
		double b=a;
		System.out.println(a);
		System.out.println(b);
		
//		long c = 12;
//		byte d =c;               error because we cant put the long value in byte                 
//		System.out.println(d);
		
//		2.explicit
		int a1=10;
		double b1=(int)a;
		System.out.println(a1);
		System.out.println(b1);
		
		double c1 = 12.0;
		int d1 =(int)c1;                               
		System.out.println(d1);
		
//		long c2 = 12;
//		byte d2 =(byte)c2;            NO error because we can put the long value in byte with explicit type casting                 
//		System.out.println(d2);
		
//		incrementation(++) and decrementation(--)
		int y = 7;
		System.out.println(y++);
		System.out.println(y);
		System.out.println(++y);
		int z = 6;
		int x = z++ + ++z + ++z + ++z + z++ + ++z + ++z - --z - z--;
		System.out.println(z);
		
//		truncation
		int x1=5;
		int x2 = 2;
		double x3 = x1/x2;
		System.out.println(x3);
		
		double y1=5;
		double y2 =3;
		double y3 = y1/y2;
		System.out.println(y3);
		
//		Naming convention
//		camelCase => variables => addTwoNumbers
//		PascalCase => class , objetcs => SchoolCount
//		snake_case => sql => my_age
		
	}
}
