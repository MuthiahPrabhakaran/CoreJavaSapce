package com.java.multithreading.race.condition.strategy.confinement;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increment() {
        totalBytes++;
    }
}
