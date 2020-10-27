package com.java.map;


import java.util.HashMap;
import java.util.Map;

public class MapMerging {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("p1","Krish");
        map.put("p2","Spoorthi");
        Map<String, String> map2 = new HashMap<>();
        map2.put("p3","Sathu");
        map2.put("p4","MP");
        map2.put("p2","Lattu");

        map2.forEach((key, value)-> {
            map.merge(key, value,(v1,v2)-> v1.equals(v2)?v1:v1+"/"+v2);
        });

        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
