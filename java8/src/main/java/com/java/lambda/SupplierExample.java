package com.java.lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
        System.out.println(supplier.get());

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
