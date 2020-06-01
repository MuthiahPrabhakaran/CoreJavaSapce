package com.java.stream.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","twenty two");
        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();

        /*stream.peek(System.out::println)
                .filter(p1.or(p2))
                .peek(s->list.add(s));

        System.out.println("Done!");
        System.out.println(list);*/

        stream.peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(s->list.add(s));

        System.out.println("Done!");
        System.out.println(list);

    }
}
