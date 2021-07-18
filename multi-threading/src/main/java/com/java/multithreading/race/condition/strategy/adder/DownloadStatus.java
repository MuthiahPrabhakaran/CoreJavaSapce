package com.java.multithreading.race.condition.strategy.adder;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private LongAdder totalBytes = new LongAdder();

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void increment() {
        totalBytes.increment();
    }
}
