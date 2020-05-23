package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        /*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };*/

        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
        List<String> list = Arrays.asList("Zenith", "MP", "Anand");
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
