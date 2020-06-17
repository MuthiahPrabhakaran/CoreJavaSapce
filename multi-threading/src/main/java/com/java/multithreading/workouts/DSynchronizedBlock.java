package com.java.multithreading.workouts;

public class DSynchronizedBlock {
    private static int count = 0;
    private static int count2 = 0;

    private static Object object1 = new Object();
    private static Object object2 = new Object();

    private static void add(){
        synchronized(object1){
            count++;
        }

    }

    public static void addAgain(){
        synchronized(object2){
            count2++;
        }
    }

    public static void compute(){
        add();
        addAgain();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<100; i++){
                compute();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<100; i++){
                compute();
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

        System.out.println("Final value of count: "+count+ ", count2: "+count2);

    }
}
