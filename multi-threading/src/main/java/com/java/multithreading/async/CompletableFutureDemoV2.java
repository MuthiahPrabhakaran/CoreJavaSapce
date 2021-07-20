package com.java.multithreading.async;

import java.util.logging.Logger;

public class CompletableFutureDemoV2 {
    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendAsync();
        //mailService.sendAsync("Hello mail");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
