package com.java.multithreading.race.condition.strategy.volatile_example;

public class ThreadDemo {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        Thread t1 = new Thread(new DownloadFileTask(status));
        Thread t2 = new Thread(() -> {
            while(!status.isDone()) {}
            System.out.println("Total number of bytes downloaded: " +status.getTotalBytes());
        });
        t1.start();
        t2.start();


    }
}
