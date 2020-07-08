package com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOEnhancement {
    public static void main(String[] args) {
        Path path = Paths.get("c:","windows-version.txt");
        try(Stream<String> lines = Files.lines(path)){
            lines.forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
