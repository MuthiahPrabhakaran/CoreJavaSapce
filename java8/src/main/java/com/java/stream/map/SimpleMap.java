package com.java.stream.map;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleMap {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("person1", 10), new Person("person2", 20), new Person("person3", 30));
        Stream<String> personNames = persons.stream().map(p -> p.getName());
        personNames.forEach(System.out::println);
    }
}
