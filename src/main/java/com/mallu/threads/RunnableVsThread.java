package com.mallu.threads;


public class RunnableVsThread {

	private static String[] s = { "a", "b", "c", "d", "e", "f" };

	public static void main(String[] args) {

		//
		Thread a = new A();
		Thread d = new D();
		C c = new C(s);

		Thread r = new Thread(c, "First");
		r.start();

		Thread r1 = new Thread(c, "Second");
		r1.start();

	}
}

class A extends Thread {

	void m1() {
		System.out.println("m1.. A");
	}

	@Override
	public void run() {
		System.out.println("run.. A");
	}
}

class B implements Runnable {
	@Override
	public void run() {
		System.out.println("run.. B");
	}
}

class C implements Runnable {
	String[] s;
	static int count = 0;
	static int noOfThreads;
	static int end = 0;

	public C(String[] s) {
		this.s = s;
	}

	@Override
	public void run() {
		//noOfThreads++;
		synchronized (this) {
			while (true) {
				if (count == s.length) break;
				for (; count < s.length;) {
					System.out.println(s[count] + "==>" + Thread.currentThread().getName());
					this.notifyAll();
					try {
						this.wait();
						count++;
						if (++end % 2 == 0)
							count--;
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