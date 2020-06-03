package com.java.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> l2 = Arrays.asList(2,4,6);
        List<Integer> l3 = Arrays.asList(3,5,7);

        List<List<Integer>> lists = Arrays.asList(l1,l2,l3);
        //System.out.println(lists);
        //lists.stream().map(l -> l.size()).forEach(System.out::println);

        //Function<List<?>, Integer> size= List::size;
        //lists.stream().map(size).forEach(System.out::println);

        Function<List<Integer>, Stream<Integer>> flapMapFunction = l -> l.stream();
        lists.stream().flatMap(flapMapFunction).forEach(System.out::println);
    }
}
