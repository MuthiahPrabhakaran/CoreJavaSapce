package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("some task");
        CompletableFuture<Void> futureWithoutOutput = CompletableFuture.runAsync(task);

        Supplier<Integer> supplier = () -> {
          return 10;
        };
        CompletableFuture<Integer> futureWithOutput = CompletableFuture.supplyAsync(supplier);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
