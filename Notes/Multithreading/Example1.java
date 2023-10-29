package Multithreading;

public class Example1 {
	public static void main (String args[]) {
//		Thread t = new Thread();
//		System.out.println(t);
		
		Thread s = Thread.currentThread();
		System.out.println(s);
		s.setName("Shafwan");
		s.setPriority(3);
		System.out.println(s);
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
	}
	
}
