package com.java.multithreading.executors.simple;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(2);
        Future<Integer> f;
        try {
            f = executors.submit(() -> {
                LongTask.simulate();
                System.out.println("Thread: " + Thread.currentThread().getName());
                return 10;
            });
        } finally {
            executors.shutdown();
        }
        System.out.println("Do some more task");
        try {
            Integer i = f.get();
            System.out.println("Result from the thread: " +i);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class LongTask {
    public static void simulate() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
