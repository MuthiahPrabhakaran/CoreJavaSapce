package com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryEnhancement {
    public static void main(String[] args) {
        Path path = Paths.get("c:","Program Files");
        // Read one level
        /*try(Stream<Path> stream = Files.list(path)){
            stream.filter(p -> p.toFile().isDirectory())
                    .forEach(System.out::println);
        }*/

        // Walks to all sub tree
        /*try(Stream<Path> stream = Files.walk(path)){
            stream.filter(p -> p.toFile().isDirectory())
                    .forEach(System.out::println);
        }*/

        // Walks to 2 level deep
        try(Stream<Path> stream = Files.walk(path, 2)){
            stream.filter(p -> p.toFile().isDirectory())
                    .forEach(System.out::println);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
