package com.java.multithreading.race.condition.strategy.synchronized_collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        Collection<Integer> l = Collections.synchronizedCollection(new ArrayList<>());
        Thread t1 = new Thread(() -> {
            l.addAll(Arrays.asList(1, 2, 3));
        });
        Thread t2 = new Thread(() -> {
            l.addAll(Arrays.asList(4,5,6));
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(l);
    }

}

