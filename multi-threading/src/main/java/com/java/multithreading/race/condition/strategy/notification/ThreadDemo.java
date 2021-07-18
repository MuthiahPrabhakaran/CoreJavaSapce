package com.java.multithreading.race.condition.strategy.notification;

public class ThreadDemo {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        Thread t1 = new Thread(new DownloadFileTask(status));
        Thread t2 = new Thread(() -> {
            while(!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Total number of bytes downloaded: " +status.getTotalBytes());
        });
        t1.start();
        t2.start();


    }
}
