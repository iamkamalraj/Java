
 

abstract class Computer  //abstract class
{
	public abstract void code();       ///declaration
	
	public abstract void playVideo();   // abstract method
	
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

class Desktop extends Computer
{
	public void code()           //defining
	{
		System.out.println("writing code on Desktop");
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

public class Project3
{

	public static void main(String[] args) 
	{
		
		Desktop desk=new Desktop();
		
		
		Alien a1=new Alien();
		a1.build(desk1);          /// error bcz build method is expecting latop type ref
		
	}

}
