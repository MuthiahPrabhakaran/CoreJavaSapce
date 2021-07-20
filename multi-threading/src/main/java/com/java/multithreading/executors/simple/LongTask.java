package com.java.multithreading.executors.simple;

public class LongTask {
    public static void simulate() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
