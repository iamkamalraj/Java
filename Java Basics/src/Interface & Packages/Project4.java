
 

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
	public void build(Computer obj)  // Computer is parent of all it can accept any child class type ref
	{
		obj.code();
	}
}

public class Project4
{

	public static void main(String[] args) 
	{
		
		Desktop desk=new Desktop();
		
		
		Alien a1=new Alien();
		a1.build(desk);          
		
	}

}
