package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoWithException {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Some method");
            throw new IllegalArgumentException();
        });
        completableFuture.thenAccept(result -> {
            System.out.println(result);
            System.out.println(Thread.currentThread().getName());
        }).exceptionally(ex -> {
            System.out.println("Exception occurred");
            return null;
        });
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
