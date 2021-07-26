package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV9Combine {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> salary = CompletableFuture.
                                                supplyAsync(() -> "200USD").
                                                thenApply((s) -> {
                                                    s= s.replace("USD","");
                                                    return Integer.parseInt(s);
                                                });
        CompletableFuture<Float> conversionRate = CompletableFuture.supplyAsync(() -> 94.2F);
        salary.
                thenCombine(conversionRate, (sal, cr) -> sal * cr).
                thenAccept(System.out::println);
        Thread.sleep(1000);
    }
}
