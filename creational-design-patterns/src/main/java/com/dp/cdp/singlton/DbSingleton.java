package com.dp.cdp.singlton;

public class DbSingleton {

	private static volatile DbSingleton instance = null; // volatile will protect even there is change in JVM

	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("use getInstance() method to create");
		}
	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) { // it will protect from objects created through reflection + if two
												// threads concurrently trying to create an instance
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
