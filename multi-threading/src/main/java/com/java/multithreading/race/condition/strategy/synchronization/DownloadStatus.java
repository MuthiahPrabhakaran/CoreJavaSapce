package com.java.multithreading.race.condition.strategy.synchronization;


public class DownloadStatus {
    private int totalBytes;
    private Object objectToLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increment() {
       synchronized (objectToLock) {
           totalBytes++;
       }
    }
}
