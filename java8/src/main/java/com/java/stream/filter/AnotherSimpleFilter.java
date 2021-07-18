package com.java.stream.filter;

import java.util.function.Predicate;

public class AnotherSimpleFilter {
    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> i < 10;
        System.out.println(p.test(12));
    }
}
