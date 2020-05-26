package com.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GeneralLambdaExample {

    public static void main(String[] args) {
        List<String> stringList = List.of("string1", "string2");
        stringList.forEach(System.out::println);

        stringList.forEach(s -> System.out.println(s));

        Consumer<String> c = System.out::println;
        stringList.forEach(c);

        List<String> anotherList = new ArrayList<>();
        Consumer<String> c2 = anotherList::add;
        stringList.forEach(c.andThen(c2));
        System.out.println(anotherList);

    }
}
