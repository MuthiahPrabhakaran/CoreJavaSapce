package com.java.multithreading.race.condition.strategy.confinement;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) {
        List<DownloadFileTask> tasks = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i<10;i++){
            DownloadFileTask status = new DownloadFileTask();
            tasks.add(status);
            Thread thread = new Thread(status);
            thread.start();
            threads.add(thread);
        }
        
        for(Thread thread:threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //int totalBytes = tasks.stream().map(m -> m.getStatus().getTotalBytes()).reduce(0, (a,b) -> a+b);
        int totalBytes = tasks.stream()
                .map(m -> m.getStatus().getTotalBytes()).reduce(0, Integer::sum);
        System.out.println("Total number of bytes downloaded: " + totalBytes);
    }
}
