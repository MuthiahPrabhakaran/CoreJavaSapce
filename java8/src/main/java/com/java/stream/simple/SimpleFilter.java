package com.java.stream.simple;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SimpleFilter {
    public static void main(String[] args) {
        List<String> list = List.of("one","two","three","twenty two");

        Stream<String> stream = list.stream().filter(s -> s.contains("two"));
        stream.forEach(System.out::println);

        List<Integer> anotherList = List.of(1,2,3,10,15,20,40);
        Predicate<Integer> p1 = i -> i<10;
        Predicate<Integer> p2 = i -> (i>10 && i<20);
        Predicate<Integer> p3 = i -> i==0;

        Predicate<Integer> p4 = p1.or(p2).or(p3);
        Stream<Integer> anotherStream = anotherList.stream().filter(p4);
        anotherStream.forEach(System.out::println);

        Predicate<Integer> p5 = Predicate.isEqual(2);
        Stream<Integer> newStream = Stream.of(1,2,3,4,5);
        newStream.filter(p5).forEach(s -> System.out.println(s));

    }
}
