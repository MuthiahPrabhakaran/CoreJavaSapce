package com.java.multithreading.workouts;

import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) {

		final PCClass pc = new PCClass();
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
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class PCClass {

	LinkedList<Integer> bucket = new LinkedList<>();
	int capacity = 2;
	int value = 0;

	public void produce() throws InterruptedException {
		synchronized (this) {
			while (true) {
				if (bucket.size() == capacity)
					wait();
				System.out.println("Producing - " + value);
				bucket.add(value++);
				notify();
				Thread.sleep(2000);
			}
		}

	}

	public void consume() throws InterruptedException {
		synchronized (this) {
			while(true) {
			if (bucket.isEmpty())
				wait();
			int val = bucket.removeFirst();
			System.out.println("Consuming - " + val);
			notify();
			Thread.sleep(2000);
		}}
	}
}
