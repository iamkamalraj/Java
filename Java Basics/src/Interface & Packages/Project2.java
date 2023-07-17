
 

abstract class Computer  //abstract class
{
	public abstract void code();       ///declaration
	
	public abstract void playVideo();   // abstract method
	public void compute()
	{
		System.out.println("computing");
	}
}

class Laptop extends Computer
{
	public void code()           //defining
	{
		System.out.println("writing code on laptop");
	}
	public void playVideo()           //defining
	{
		System.out.println("playing Telusko's video");
	}
}


class Alien
{
	public void build(Laptop obj)
	{
		obj.code();
	}
}

public class Project2
{

	public static void main(String[] args) 
	{
		
		Laptop lap1=new Laptop();
		
		
		Alien a1=new Alien();
		a1.build(lap1);
		
	}

}
