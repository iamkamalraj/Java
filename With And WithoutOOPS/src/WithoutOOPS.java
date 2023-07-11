import java.util.Scanner;

// Without OOPS

class Rectangle
{
	float len;
	float brd;
	float area;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length of rectangle");
		len=scan.nextFloat();
		System.out.println("Please enter breadth of rectangle");
		brd=scan.nextFloat();
	}
	
	void compute()
	{
		area=len*brd;
	}
	
	void disp()
	{
		System.out.println("Area of rect is "+area);
	}
}

class Square
{
	float len;
	
	float area;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length of square");
		len=scan.nextFloat();
		
	}
	
	void compute()
	{
		area=len*len;
	}
	
	void disp()
	{
		System.out.println("Area of square is "+area);
	}
}

class Circles
{
	float rad;

	float area;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length of circle");
		rad=scan.nextFloat();
		
	}
	
	void compute()
	{
		area=3.14f*rad*rad;
	}
	
	void disp()
	{
		System.out.println("Area of circle is "+area);
	}
	
}

public class WithoutOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circles c=new Circles();
		
		r.input();
		r.compute();
		r.disp();
		
		s.input();
		s.compute();
		s.disp();
		
		
		c.input();
		c.compute();
		c.disp();

	}

}









