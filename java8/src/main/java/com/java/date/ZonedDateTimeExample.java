package com.java.date;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        /*Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds);*/
        ZonedDateTime currentMeeting = ZonedDateTime.of(LocalDate.of(2020, Month.JUNE, 16), LocalTime.of(12,00),
                ZoneId.of("Asia/Kolkata"));
        System.out.println("Current meeting date: "+currentMeeting);

        ZonedDateTime nextMeeting = currentMeeting.plusMonths(1);
        System.out.println("Next meeting date: "+nextMeeting);

        ZonedDateTime nextMeetingTokyo = nextMeeting.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Next meeting date in Tokyo: "+nextMeetingTokyo);


    }
}
