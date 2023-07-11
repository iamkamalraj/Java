import java.util.Scanner;

// With OOPS

abstract class Shapes
{
	float area;
	abstract void input();
	abstract void compute();
	void disp()
	{
		
		System.out.println("The area is "+ area);
	}	
}
class Rectangle1 extends Shapes
{
	float len;
	float brd;
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
	
}
class Square1 extends Shapes
{
	float len;
	
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
	
}
class Circles1 extends Shapes
{
	float rad;
   final float pi=3.14f;

	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length of circle");
		rad=scan.nextFloat();
		
	}
	
	void compute()
	{
		area=pi*rad*rad;
	}
}

class Geometry
{
	void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}



public class WithOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle1 r=new Rectangle1();
		Square1 s=new Square1();
		Circles1 c=new Circles1();
		
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);

	}

}









