package com.java.multithreading.workouts;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(2);
		Mythread mythread = new Mythread(sem, "thread-1");
		Mythread mythread1 = new Mythread(sem, "thread-2");

		mythread.start();
		mythread1.start();

		try {
			mythread.join();
			mythread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Shared {
	public static int sharedCount = 0;
}

class Mythread extends Thread {

	Semaphore sem;
	String threadName;

	Mythread(Semaphore sem, String threadName) {
		super();
		this.sem = sem;
		this.threadName = threadName;
	}

	public void run() {
		if (threadName.equals("thread-1")) {
			System.out.println("Starting " + threadName);
			System.out.println(threadName + " is waiting for permit");
			try {
				sem.acquire();
				for (int i = 1; i <= 5; i++) {
					Shared.sharedCount++;
					System.out.println("Shared count " + Shared.sharedCount);
				}
				sem.release();
				System.out.println(threadName + " is released");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Starting " + threadName);
			System.out.println(threadName + " is waiting for permit");
			try {
				sem.acquire();
				for (int i = 1; i <= 5; i++) {
					Shared.sharedCount--;
					System.out.println("Shared count " + Shared.sharedCount);
				}
				sem.release();
				System.out.println(threadName + " is released");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
