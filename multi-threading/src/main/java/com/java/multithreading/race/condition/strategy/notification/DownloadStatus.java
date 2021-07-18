package com.java.multithreading.race.condition.strategy.notification;


public class DownloadStatus {
    private int totalBytes;
    private volatile boolean isDone;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increment() {
           totalBytes++;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
