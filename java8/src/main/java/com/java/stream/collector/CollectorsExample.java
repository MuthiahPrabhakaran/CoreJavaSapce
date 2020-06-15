package com.java.stream.collector;

import com.java.stream.map.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String... args) {
        List<Person> persons = Arrays.asList(new Person("Sarah", 15), new Person("Philip", 21), new Person("Beth", 23), new Person("Simon", 25),
                new Person("Nina", 23), new Person("Allan", 28), new Person("Leonard", 18), new Person("Barbara", 26),
                new Person("Penelope", 18), new Person("Albert", 31), new Person("Lucy", 42), new Person("Charles", 26),
                new Person("Ella", 24), new Person("Louis", 32), new Person("Liza", 17), new Person("Franck", 18),
                new Person("Amy", 26), new Person("Nathan", 33));


        Stream<Person> personStream = persons.stream();
        Optional<Person> personLessThan20 = personStream.filter(person -> person.getAge() >= 20).min(Comparator.comparing(Person::getAge));
        System.out.println(personLessThan20);

        Optional<Person> olderPerson = persons.stream().max(Comparator.comparing(Person::getAge));
        System.out.println(olderPerson);

        Optional<Person> youngerPerson = persons.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(youngerPerson);

        Map<Integer, List<Person>> map = persons.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map);

        Map<Integer, Long> anotherMap = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println(anotherMap);

        Map<Integer, List<String>> mapWithNames = persons.stream().collect(
                Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println("mapWithNames : "+mapWithNames);

        Map<Integer, Set<String>> mapWithTreeSet = persons.stream().collect(
                Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toCollection(TreeSet::new))));
        System.out.println("mapWithTreeSet :" +mapWithTreeSet);

        Map<Integer, String> mapWithString = persons.stream().collect(
                Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.joining(", "))));
        System.out.println("mapWithString : " +mapWithString);

    }
}
