package com.java.multithreading.workouts.AnotherSet;

/*public class AThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}*/


public class AThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        /*try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("File is ready to be scanned");
    }
}

class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file : " +Thread.currentThread().getName());
        for(int i=0;i<= Integer.MAX_VALUE;i++){
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte : "+i);
        }
        System.out.println("Downloading complete : " +Thread.currentThread().getName());
    }
}
