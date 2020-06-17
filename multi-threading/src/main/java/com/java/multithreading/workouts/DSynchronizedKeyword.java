package com.java.multithreading.workouts;


public class DSynchronizedKeyword {

    public static int count = 0;

    public static synchronized void increment(){
        count++;
    }

    public static void process(){

        Thread t1 = new Thread(() -> {
            for(int i = 0; i<100; i++){
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i<100; i++){
                increment();
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        process();
        System.out.println("Threads are stopped. Final value of counter: "+count);
    }
}
