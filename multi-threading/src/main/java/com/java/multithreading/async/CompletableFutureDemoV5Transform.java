package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV5Transform {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 30);
        completableFuture.thenApply(CompletableFutureDemoV5Transform::convertToFahrenheit)
                .thenAccept(System.out::println);
        // completableFuture.thenApply(c -> (c * 1.8) + 32).thenAccept(f -> System.out.println(f));
        Thread.sleep(2000);
    }

    private static int convertToFahrenheit(int celsius) {
        return (int)(celsius * 1.8) + 32;
    }
}
