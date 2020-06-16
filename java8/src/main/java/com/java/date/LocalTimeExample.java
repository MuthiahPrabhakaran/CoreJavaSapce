package com.java.date;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        System.out.println("Current Time : " + LocalTime.now());
        LocalTime meetingTime = LocalTime.of(12,30);
        System.out.println("Meeting will happen at " + meetingTime);

        LocalTime sleepingTime = LocalTime.of(23,00);
        LocalTime wakeUpTime = sleepingTime.plusHours(6);
        System.out.println("My wakeup time is "+wakeUpTime);
    }
}
