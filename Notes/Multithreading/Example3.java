package Multithreading;

class Demo4 implements Runnable{                                   //every class should extends thread in order to do multithreading
	public void run() {                         
		System.out.println("Banking Task Started");
		for(int i=0;i<3;i++) {
			System.out.println("Banking......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Banking Completed");
	}
}
class Demo5 implements Runnable{
	public void run() {                                          //This handling approach is best
		for(int i=0;i<3;i++) {
			System.out.println("printing......");
			try {		
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Completed");
	}
}
class Demo6 implements Runnable{
	public void run() {                                          
		cal();
	}
	void cal() {                                         //we can also method with any name but it should be called from run method only
		for(int i=0;i<3;i++) {
			System.out.println("Calculation......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Calculation Completed");
	}
}
public class Example3 {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Main thread got the chance first");
		Thread t = Thread.currentThread();               
		System.out.println(t.isAlive());       //checking main thread started or not
		
		Demo4 d4 = new Demo4();
		Demo5 d5 = new Demo5();
		Demo6 d6 = new Demo6();
		Thread t1 = new Thread(d4);
		Thread t2 = new Thread(d5);
		Thread t3 = new Thread(d6);
		
		System.out.println(t1.isAlive());
		
		t1.start();
		
		System.out.println(t1.isAlive());
		
		t2.start();
		t3.start();
		
		t1.join();             //we're saying main method to wait till t1 completes his work
		t2.join();
		t3.join();
		System.out.println("Main Thread Completed First also");
	}
	}
