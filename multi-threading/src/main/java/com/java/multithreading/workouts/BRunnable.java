package com.java.multithreading.workouts;

class Runner3 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<9;i++){
            System.out.println("Runner3 : "+i);
        }
    }
}


class Runner4 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<9;i++){
            System.out.println("Runner4 : "+i);
        }
    }
}

public class BRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner3());
        Thread t2 = new Thread(new Runner4());

        // Java 8
        Runnable r1 = () -> {
            for(int i=0;i<9;i++){
            System.out.println("Runner5 : "+i);
        }};

        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
    }
}
