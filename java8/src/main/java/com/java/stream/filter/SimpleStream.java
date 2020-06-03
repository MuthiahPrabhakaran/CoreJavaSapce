package com.java.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SimpleStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println("Simple stream");
        list.stream().forEach(s -> System.out.println(s));

        List<Integer> anotherList = new ArrayList<>();
        Consumer<Integer> consumer = c -> anotherList.add(c);
        Consumer<Integer> anotherConsumer = System.out::println;

        list.stream().forEach(consumer);
        list.stream().forEach(consumer.andThen(anotherConsumer));


        System.out.println(anotherList);
    }
}
