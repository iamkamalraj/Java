package Multithreading;

class Demo7 extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("BANK")) {
			banking();
		}
		else if (name=="PRINT") {        //we can write like this too
			printing();
		}
		else {
			calculating();
		}
	}
	void banking() {
		System.out.println("Banking Task Started");
		for(int i=0;i<3;i++) {
			System.out.println("Banking......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Banking Completed");
	}
	void printing() {
		System.out.println("Printing Task Started");
		for(int i=0;i<3;i++) {
			System.out.println("Printing......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing Completed");
	}
	void calculating() {
		System.out.println("Calculating Task Started");
		for(int i=0;i<3;i++) {
			System.out.println("Calculating......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Calculation Completed");

	}
}
public class Example4 {
	public static void main(String args[]) {
		Demo7 d1=new Demo7();
		Demo7 d2=new Demo7();
		Demo7 d3 = new Demo7();
		d1.setName("BANK");
		d2.setName("PRINT");
		d3.setName("CALC");
		d1.start();
		d2.start();
		d3.start();
	}
	
}
