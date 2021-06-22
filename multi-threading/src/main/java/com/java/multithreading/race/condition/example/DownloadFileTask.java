package com.java.multithreading.race.condition.example;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: "+Thread.currentThread().getName());
        for(int i = 0; i < 10_000; i++) {
            if(Thread.currentThread().isInterrupted())
                return;
            status.increment();
        }
        System.out.println("Download complete: " +Thread.currentThread().getName());
    }
}
