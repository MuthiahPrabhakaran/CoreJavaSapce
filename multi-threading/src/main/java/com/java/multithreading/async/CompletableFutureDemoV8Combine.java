package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV8Combine {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> salary = CompletableFuture.supplyAsync(() -> 200);
        CompletableFuture<Float> conversionRate = CompletableFuture.supplyAsync(() -> 94.2F);
        salary.
                thenCombine(conversionRate, (sal, cr) -> sal * cr).
                thenAccept(System.out::println);
        Thread.sleep(1000);
    }
}
