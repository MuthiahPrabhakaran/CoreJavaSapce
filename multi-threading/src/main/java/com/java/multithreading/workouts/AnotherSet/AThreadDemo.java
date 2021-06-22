package com.java.multithreading.workouts.AnotherSet;

public class AThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}


class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file : " +Thread.currentThread().getName());
    }
}
