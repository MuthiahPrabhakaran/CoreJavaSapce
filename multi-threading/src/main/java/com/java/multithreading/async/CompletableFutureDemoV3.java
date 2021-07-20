package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV3 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("some task");
        });
        future.thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("task completed...");
        });
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("task completed..");
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
