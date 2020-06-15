package com.java.date;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuration {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);
        long mills = elapsed.toMillis();
        //long hours = elapsed.toHours();
        System.out.println(mills);
    }
}
