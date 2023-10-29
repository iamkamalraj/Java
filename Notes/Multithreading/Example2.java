package Multithreading;

class Demo1 extends Thread{                                   //every class should extends thread in order to do multithreading
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
class Demo2 extends Thread{
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
class Demo3 extends Thread{
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
public class Example2 {
	public static void main (String args[]) throws Exception {
		/* Using Only Main Thread
		System.out.println("Banking Task Started");
		for(int i=0;i<3;i++) {
			System.out.println("Banking......");
			Thread.sleep(2000);
		}
		System.out.println("Banking Completed");
		System.out.println("-----------------------");
		for(int i=0;i<3;i++) {
			System.out.println("printing......");
			Thread.sleep(2000);
		}
		System.out.println("Printing Completed");
		System.out.println("-----------------------");
		for(int i=0;i<3;i++) {
			System.out.println("Calculation......");
			Thread.sleep(2000);
		}
		System.out.println("Calculation Completed");
		*/
		//Using Multithreading
		
		Demo1 d1=new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();                        //we should not call run method , start ethod will call the run method
		d2.start();
		d3.start();
	}
}
