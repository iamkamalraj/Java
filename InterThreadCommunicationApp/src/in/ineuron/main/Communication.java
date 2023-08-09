package in.ineuron.main;

//producer thread operations
class Producer extends Thread {

	// Producer producing the data in StringBuffer
	StringBuffer sb;

	// variable used by thread for Communication
	boolean dataProvider = false;

	public Producer() {
		// StringBuffer object is created with a default capacity 16
		sb = new StringBuffer();
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				sb.append(i + ": ");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		// informing the consumer that data is produced
		dataProvider = true;

	}

}

//Consumer thread operations
class Consumer extends Thread {

	// Creating producer object to get the produced data from StringBuffer
	Producer producer;
	
	
	//injecting the Producer Object into Consumer
	public Consumer(Producer producer) {
		this.producer = producer;
	}


	@Override
	public void run() {
		
		//check for the producer dataProvider for the dataProvider variable
		//if true only consume the data otherwise enter into sleeping state
		while(producer.dataProvider == false) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//consume the data produced by the producer
		System.out.println(producer.sb);

	}

}

//Ineffecient way of interthread communication 
public class Communication {

	public static void main(String[] args) {

		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);
		
		
		Thread t1 = new Thread(obj1);//producer thread
		Thread t2 = new Thread(obj2);//consumer thread
		
		t2.start();//consumer should wait
		t1.start();//producer should start
			
	}

}
