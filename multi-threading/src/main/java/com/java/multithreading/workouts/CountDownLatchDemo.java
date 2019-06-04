package com.java.multithreading.workouts;

import java.util.concurrent.CountDownLatch;


public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(2); //try changing into 4
		Worker w1 = new Worker("worker-1", latch);
		Worker w2 = new Worker("worker-2", latch);
		Worker w3 = new Worker("worker-3", latch);
		Worker w4 = new Worker("worker-4", latch);

		w1.start();
		w2.start();
		w3.start();
		w4.start();

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " is finished");
	}

}

class Worker extends Thread {
	String threadName;
	CountDownLatch latch;

	Worker(String threadName, CountDownLatch latch) {
		this.threadName = threadName;
		this.latch = latch;
	}

	public void run() {
		latch.countDown();
		System.out.println(threadName + " is finished");
	}
}
