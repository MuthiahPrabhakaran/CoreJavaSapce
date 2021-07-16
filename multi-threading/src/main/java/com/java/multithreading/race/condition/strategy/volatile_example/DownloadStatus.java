package com.java.multithreading.race.condition.strategy.volatile_example;


public class DownloadStatus {
    private int totalBytes;
    private Object objectToLock = new Object();
    private volatile boolean isDone;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increment() {
       synchronized (objectToLock) {
           totalBytes++;
       }
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
