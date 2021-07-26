package com.java.multithreading.async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemoV7Compose {
    public static void main(String[] args) throws InterruptedException {
        getEmail().
                thenCompose(CompletableFutureDemoV7Compose::getPlaylistByEmail)
                .thenAccept(System.out::println);
        Thread.sleep(1000);
    }

    private static CompletableFuture<String> getEmail() {
        // do something
        return CompletableFuture.supplyAsync(() -> "johndoe@jh.com");
    }

    private static CompletableFuture<String> getPlaylistByEmail(String email) {
        // do something
        return CompletableFuture.supplyAsync(() -> ("Playlist for the email: " + email));
    }
}
