package com.dp.cdp.singlton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static volatile DbSingleton instance = null; // volatile will protect even there is
                                                         // change in JVM
    private static volatile Connection conn = null;

    private DbSingleton() {

        try {
            // Driver implementation
            // DriverManager.registerDriver(new org.apache.derby.jdbc.EmbedderDriver());
        } catch (Exception e) { // Change it to SqlException
            e.printStackTrace();
        }

        if (conn != null) {
            throw new RuntimeException("use getConnection() method to create");
        }

        if (instance != null) {
            throw new RuntimeException("use getInstance() method to create");
        }
    }

    /**
     * We haven't make the whole method synchronized. It will slow down the app
     * Whenever a object calls this method, it will go into synchronized mode
     */
    public static DbSingleton getInstance() {
        if (instance == null) {             // Lazily loaded
            synchronized (DbSingleton.class) { // it will protect from objects created through
                                               // reflection + if two
                                               // threads concurrently trying to create an instance

                // This is a double check locking mechanism. Eg, if two threads are concurrently accessing this method,\
                // One has a lock on it, it will create the instance on first time. Then, when a second thread got access,
                // It won't again create the instance. This scenario happens on the very first time alone.
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() { // no-static
        if (conn == null) {
            synchronized (DbSingleton.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
