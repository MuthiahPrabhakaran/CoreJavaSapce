package com.java;

import java.util.List;
import java.util.StringJoiner;

public class StringEnhancement {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(" ", "[", "]");
        stringJoiner.add("Hello").add("World");

        String s = stringJoiner.toString();
        System.out.println(s);

        String anotherString = String.join(",", "one", "two", "three");
        System.out.println(anotherString);

        List<String> words = List.of("it","is","a","word");
        System.out.println(String.join(" ",words));
    }
}
