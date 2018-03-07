package com.mallu.threads;

public class Joins {
public static void main(String[] args) throws InterruptedException {
	Thread t1=new Thread(new ThreadOne());
	Thread t2=new Thread(new ThreadTwo());
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	System.out.println("Done..");
	
}
	
}

class ThreadOne implements Runnable{
	@Override
	public void run() {
		System.out.println("thread1");
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("thread2");
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}