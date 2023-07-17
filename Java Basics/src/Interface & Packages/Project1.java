
 //Abstraction

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


public class Project1
{

	public static void main(String[] args) 
	{
		Computer com=new Laptop();
		com.code();
		com.compute();
		com.playVideo(); 
	}

}
