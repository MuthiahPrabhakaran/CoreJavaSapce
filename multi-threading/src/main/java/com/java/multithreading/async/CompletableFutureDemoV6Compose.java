package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV6Compose {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.supplyAsync(() -> "email").
                thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist"))
                .thenAccept(System.out::println);
        Thread.sleep(1000);
    }
}
