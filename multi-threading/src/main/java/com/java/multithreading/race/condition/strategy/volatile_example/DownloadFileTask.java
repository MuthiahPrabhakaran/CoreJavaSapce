package com.java.multithreading.race.condition.strategy.volatile_example;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100_000; i++) {
            if(Thread.currentThread().isInterrupted())
                return;
            status.increment();
        }
        status.done();
    }
}
