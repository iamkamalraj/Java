package Multithreading;

class Calci{
	public int add(int...num) {           // instead of : we should write ... //This is varArgs(variable length argument)
		int sum=0;
		for(int i:num) {                 
			sum = sum+i;
		}
		return sum ;
	}
}

public class VarArgs {
	public static void main (String args[]) {
		
//		int []num= {8,9,3,4,3,4};
//		Calci c = new Calci();
//		int res =c.add(num);
//		System.out.println(res);
		
		//without creating array
		
		Calci c = new Calci();
		int res =c.add(8,9,3,4,3,4);
		System.out.println(res);
		
	}
}
