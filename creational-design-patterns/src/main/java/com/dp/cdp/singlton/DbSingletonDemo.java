package com.dp.cdp.singlton;

import java.sql.Connection;

public class DbSingletonDemo {

	public static void main(String[] args) {

		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);

		DbSingleton anotherInstance = DbSingleton.getInstance();
		System.out.println(anotherInstance); // both instance and another instance will be the same object single
												// Singleton allows to create one object

		//Connection conn = instance.getConnection();
		
		/**
		 * logic with conn.createStatement()
		 */
	}

}
