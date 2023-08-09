package in.ineuron.main;

//Extending the Thread class to create a UserDefined Thread
class Test extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Child thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//implementing runnable interface through class
class TestApp implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Child thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DemoApp {
	public static void main(String[] args) {

		//Ananomyous Inner class coding
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					try {
						System.out.println("Child thread");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();

		
		//Lambda Expression coding
		Thread t = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println("Child thread");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t.start();

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Main thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
