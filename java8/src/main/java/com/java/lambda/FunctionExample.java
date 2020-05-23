package com.java.lambda;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> func = s -> s.length();
        Integer i = func.apply("Test");
        System.out.println(i);

        Function<Integer, Integer> anotherFunc = s -> s*2;

        Integer j = func.andThen(anotherFunc).apply("Test");
        System.out.println(j);
    }
}
