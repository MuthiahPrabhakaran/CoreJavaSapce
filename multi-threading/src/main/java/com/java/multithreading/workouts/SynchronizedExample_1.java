package com.java.multithreading.workouts;

public class SynchronizedExample_1 {
	public static void main(String[] args) {
		Sender sender = new Sender();
		ThreadSend t1 = new ThreadSend("msg1", sender);
		ThreadSend t2 = new ThreadSend("msg2", sender);
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

class Sender{
	public synchronized void send(String msg) {
		System.out.println("sending\t" + msg);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(msg + "\tSent"); 	
	}
}

class ThreadSend extends Thread{
	private String msg;
	private Sender sender;
	
	ThreadSend(String msg, Sender sender){
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		sender.send(msg);
	}
}
