package com.java.multithreading.executors.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(2);
        try {
            for (int i = 0; i < 10; i++) {
                int finalI = i;
                executors.submit(() -> System.out.println("Thread: " + Thread.currentThread().getName() + ", Task: " + finalI));
            }
        } finally {
            executors.shutdown();
        }

    }
}
