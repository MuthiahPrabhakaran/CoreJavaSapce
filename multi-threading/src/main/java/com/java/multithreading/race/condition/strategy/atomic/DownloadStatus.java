package com.java.multithreading.race.condition.strategy.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void increment() {
        totalBytes.incrementAndGet();
    }
}
