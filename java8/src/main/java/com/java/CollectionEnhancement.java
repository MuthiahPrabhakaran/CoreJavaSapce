package com.java;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionEnhancement {
    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList("one","two","three","four","seven");
        List<String> numbers = new ArrayList<>(strings);
        numbers.removeIf(n -> n.length() > 4);
        numbers.replaceAll(String::toUpperCase);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.stream().collect(Collectors.joining(",")));
    }
}
