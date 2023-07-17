
interface Portable
{
   void carry();	
}



abstract class Computer  //abstract class
{
	public abstract void code();       ///declaration
	
	public abstract void playVideo();   // abstract method
	
}

class Laptop extends Computer implements Portable
{
	public void code()           //defining
	{
		System.out.println("writing code on laptop");
	}
	public void playVideo()           //defining
	{
		System.out.println("playing Telusko's video");
	}
	public void carry()
	{
		System.out.println("let's go...");
	}
}



class Mobile extends Computer implements Portable
{
	public void code()           //defining
	{
		System.out.println("writing code on Mobile ");
	}
	public void playVideo()           //defining
	{
		System.out.println("playing Telusko's video");
	}
	public void carry()
	{
		System.out.println("let's go...");
	}
	
}


class Alien
{
	public void build(Computer obj)  // Computer is parent of all it can accept any child class type ref
	{
		obj.code();
	}
}

public class Project5
{

	public static void main(String[] args) 
	{
		
		Desktop desk=new Desktop();
		
		
		Alien a1=new Alien();
		a1.build(desk);          
		
	}

}
