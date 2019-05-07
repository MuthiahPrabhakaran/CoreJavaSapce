package com.dp.cdp.singlton;

public class DbSingletonDemo {

	public static void main(String[] args) {

		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);

		DbSingleton anotherInstance = DbSingleton.getInstance();
		System.out.println(anotherInstance); // both instance and another instance will be the same object sincle
												// Singleton allows to create one object

	}

}
