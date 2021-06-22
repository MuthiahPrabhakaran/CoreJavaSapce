package com.java.multithreading.race.condition.example;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increment() {
        totalBytes++;
    }
}
