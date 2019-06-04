package com.java.multithreading.workouts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;


public class SemaphoreExample2 {


	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		Task t1 = new Task("task 1", semaphore);
		Task t2 = new Task("task 2", semaphore);
		Task t3 = new Task("task 3", semaphore);
		Task t4 = new Task("task 4", semaphore);
		Task t5 = new Task("task 5", semaphore);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}


}

class Task extends Thread {

	String taskName;
	Semaphore semaphore;

	Task(String taskName, Semaphore semaphore) {
		this.taskName = taskName;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			System.out.println(taskName + " - waiting for the lock");
			semaphore.acquire();
			System.out.println(taskName + " - got the permit");
			System.out.println("Available permit - " + semaphore.availablePermits());
			for (int i = 0; i <= 2; i++) {
				Date d = new Date();
				SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
				System.out.println("Executing Time for task name - " + taskName + " = " + ft.format(d));
			}
			System.out.println(taskName + " complete");
			semaphore.release();
			System.out.println(taskName + " - released the lock");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
