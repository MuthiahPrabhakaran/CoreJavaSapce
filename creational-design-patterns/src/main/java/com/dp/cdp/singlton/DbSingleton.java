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

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) { // it will protect from objects created through
                                               // reflection + if two
                                               // threads concurrently trying to create an instance
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
