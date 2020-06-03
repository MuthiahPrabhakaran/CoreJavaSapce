package com.java.stream.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekOperation {
    public static void main(String[] args) {

        final List<String> strings
                = Stream.of("one", "two", "three", "four")
                .peek(e-> System.out.println("Original Element: " + e))
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println("Final Results: " + strings);
    }
}
