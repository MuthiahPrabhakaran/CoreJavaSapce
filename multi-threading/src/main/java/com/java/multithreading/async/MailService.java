package com.java.multithreading.async;

import com.java.multithreading.executors.simple.LongTask;

import java.util.concurrent.CompletableFuture;

public class MailService {
    private void send() {
        LongTask.simulate();
        System.out.println("Mail was sent..");
    }

    public void sendAsync() {
        CompletableFuture.runAsync(this::send);
        // or
        // CompletableFuture.runAsync(() -> send());
    }

    private void send(String message) {
        LongTask.simulate();
        System.out.println("Mail was sent..");
        System.out.println("Message: " + message);
    }

    public void sendAsync(String message) {
        CompletableFuture.runAsync(() -> send(message));
    }
}
