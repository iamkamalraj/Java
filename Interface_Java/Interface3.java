
interface Calcu
{
	void add();
}

class MyCal2 
{
	void sub()
	{
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println(c);	
	}
}

class MyC extends MyCal2 implements Calcu 	// First Extends
											// Then Implements
{
	public void add()
	{
		
	}
}


public class Interface3 {

	public static void main(String[] args) {
		

	}

}

