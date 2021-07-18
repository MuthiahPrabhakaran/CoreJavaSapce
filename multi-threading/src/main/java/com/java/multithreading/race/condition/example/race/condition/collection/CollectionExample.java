package com.java.multithreading.race.condition.example.race.condition.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
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

// Actual output [1, 2, 3]
