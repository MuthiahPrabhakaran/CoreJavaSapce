package com.java.multithreading.race.condition.strategy.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private Lock lock = new ReentrantLock();
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increment() {
        lock.lock();
        try {
            totalBytes++;
        } finally {
            lock.unlock();
        }

    }
}
