package com.java.multithreading.workouts;

public class SynchronizedExample_2 {
	public static void main(String[] args) {
		SenderClass sender = new SenderClass();
		ThreadedSend t1 = new ThreadedSend("msg1", sender);
		ThreadedSend t2 = new ThreadedSend("msg2", sender);
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

class SenderClass{
	public void send(String msg) {
		synchronized(this) {
			System.out.println("sending\t" + msg);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(msg + "\tSent"); 	
		}
	}
}

class ThreadedSend extends Thread{
	private String msg;
	private SenderClass sender;
	
	ThreadedSend(String msg, SenderClass sender){
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		sender.send(msg);
	}
}
