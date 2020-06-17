package com.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("MP","Muthiah Prabhakaran");
        map.put("Key", "Value");

        for(String value: map.values()){
            System.out.println("Value: " +value);
        }

        for(String key: map.keySet()){
            System.out.println("Key: " +key);
        }

        for(Map.Entry<String, String> m: map.entrySet()){
            System.out.println("Key: " + m.getKey() + ", Value: " + m.getValue());
        }
    }

}
