package com.java.multithreading.race.condition.strategy.concurrent_collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrent_collection {
    public static void main(String[] args) {
        Map<String, String> m = new ConcurrentHashMap<>();
        m.put("key", "value");
    }
}
