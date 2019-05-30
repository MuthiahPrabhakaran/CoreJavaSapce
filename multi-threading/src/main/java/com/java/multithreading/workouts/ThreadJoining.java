package com.java.multithreading.workouts;

public class ThreadJoining {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		ThreadClass t2 = new ThreadClass();
		ThreadClass t3 = new ThreadClass();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			t1.interrupt();
		}
		t2.start();
		t3.start();
	}

}


class ThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			
		}
	}
}
