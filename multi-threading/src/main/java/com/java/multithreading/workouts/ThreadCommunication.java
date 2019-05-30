package com.java.multithreading.workouts;

public class ThreadCommunication {

	public static void main(String[] args) {
		
		final PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		

	}

}

class PC {
	public void produce() throws InterruptedException {
		synchronized (this) {
			Thread.sleep(1000);
			System.out.println("Started Producing");
			wait();
			System.out.println("Resumed");
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized (this) {
			Thread.sleep(1000);
			System.out.println("Started Consuming");
			notify();
			Thread.sleep(1000);
			System.out.println("Notified");
			Thread.sleep(1000);
		}
	}
}
