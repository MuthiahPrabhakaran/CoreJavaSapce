package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample {
    public static void main(String[] args) {
        Map<String, Integer> map
                = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);

        Integer i = map.computeIfAbsent("key5", k -> 1000+1000);
        map.computeIfAbsent("key4", k -> 1000+1000);
        System.out.println(i); //If key is not found, it will return the computed value

        Integer j = map.putIfAbsent("key6", 20000+3000);
        System.out.println(j);//If key is not found, it will return null

        map.forEach((k,v) -> System.out.println(k +" : "+ v));
    }
}
