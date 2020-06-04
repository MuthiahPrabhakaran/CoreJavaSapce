package com.java.optional;

import java.io.IOException;
import java.util.Optional;

public class OptionalWorkout {
    public static void main(String[] args) {
        Optional<Integer> i = Optional.empty();
        if(i.isEmpty()){
            System.out.println("i is empty");
        }

        System.out.println(i.orElse(0));

        i = Optional.of(10);
        System.out.println("i value is "+i.get());

        i = Optional.empty();
        try{
            System.out.println(i.orElseThrow(IOException::new));
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
