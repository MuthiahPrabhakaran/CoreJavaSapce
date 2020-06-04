package com.java.stream.reduction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class BasicReduce {
    public static void main(String[] args) {
        List<Integer> ages = List.of(1,2,3,6,4,5);
        Integer ageSum = ages.stream().reduce(0, (i1,i2)-> i1+i2);
        System.out.println(ageSum);

        BinaryOperator<Integer> sum = (i1, i2) -> i1+i2;

        Stream<Integer> emptyStream = Stream.empty();
        System.out.println(emptyStream.reduce(0,sum));

        Stream<Integer> singleElementStream = Stream.of(1);
        System.out.println(singleElementStream.reduce(0,sum));

        System.out.println(ages.stream().count());
        ages.stream().sorted().forEach(System.out::println);

        System.out.println(ages.stream().reduce(0, Integer::sum));

        ages = List.of(-10); // Try assigning value like -10, 10
        int maxElement = ages.stream().reduce(2, Integer::max);
        System.out.println("maxElement "+maxElement);


        ages = List.of();// Try with negative values
        Optional<Integer> maxValue = ages.stream().reduce(Integer::max);
        System.out.println(maxValue.isEmpty());

    }
}
