package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV4 {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 1);
        completableFuture.thenAccept(result -> {
            System.out.println(result);
            System.out.println(Thread.currentThread().getName());
        });
        completableFuture.thenAcceptAsync(result -> {
            System.out.println(result);
            System.out.println(Thread.currentThread().getName());
        });
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
