package in.ineuron.producerconsumer.main;

//producer thread operations
class Producer extends Thread {

	// Producer producing the data in StringBuffer
	StringBuffer sb;

	public Producer() {
		// StringBuffer object is created with a default capacity 16
		sb = new StringBuffer();
	}

	@Override
	public void run() {

		synchronized (sb) {

			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i + ": ");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			// send the notification to the waiting thread
			sb.notify();
		}

	}

}

//Consumer thread operations
class Consumer extends Thread {

	// Creating producer object to get the produced data from StringBuffer
	Producer producer;

	// injecting the Producer Object into Consumer
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {

		synchronized (producer.sb) {
			
			try {
				
				//wait till the notification is sent by producer
				producer.sb.wait();
				
				// consume the data produced by the producer
				System.out.println(producer.sb);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//Effecient way of interthread communication  using wait() and notify()
public class BetterCommunication {

	//Driving code where he start the other thread
	public static void main(String[] args) {

		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);

		Thread t1 = new Thread(obj1);// producer thread
		Thread t2 = new Thread(obj2);// consumer thread

		t2.start();// consumer should wait
		t1.start();// producer should start
	}
}
