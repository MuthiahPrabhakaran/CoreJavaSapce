package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        Consumer<List<Integer>> displayList = (list) -> list.stream().forEach(a -> System.out.println(a));
        List<Integer> list = Arrays.asList(1,2,3,4);
        displayList.accept(list);

    }
}
