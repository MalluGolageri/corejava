package core;


public class EvenOddWithSingleRun {

	private static int[] s = { 1,2,3,4,5,6,7,8,9,10,11,12 };

	public static void main(String[] args) {

		//		
		Thread d = new D();
		EvenOddProducer c = new EvenOddProducer(s);

		Thread r = new Thread(c, "odd");
		r.start();

		Thread r1 = new Thread(c, "even");
		r1.start();

	}
}

class EvenOddProducer implements Runnable {
	int[] s;
	static int count = 1;
	static int noOfThreads;
	static int end = 0;

	public EvenOddProducer(int[] s) {
		this.s = s;
	}

	@Override
	public void run() {
		//noOfThreads++;
		synchronized (this) {
			while (true) {
				if (count == 50) break;
				while (count < 50) {
					System.out.println(count++ + "==>" + Thread.currentThread().getName());
					this.notifyAll();
					try {
						this.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} // end of while
		}
	}
}

class D extends Thread {
	public void run() {
		System.out.println("run.. D");
	}
}