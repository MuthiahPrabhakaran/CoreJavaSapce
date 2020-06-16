package com.java.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class DateAndTime {
    public static void main(String[] args) {

        Person person1 = new Person("Sarah", LocalDate.of(1999 ,12, 15));
        Person person2 = new Person("Philip", LocalDate.of(1993 ,8, 12));
        Person person3 = new Person("Beth", LocalDate.of(1991 ,6, 5));
        Person person4 = new Person("Simon", LocalDate.of(1990 ,3, 23));
        Person person5 = new Person("Nina", LocalDate.of(1991 ,7, 12));
        Person person6 = new Person("Allan", LocalDate.of(1985 ,2, 14));
        Person person7 = new Person("Leonard", LocalDate.of(1996 ,10, 27));
        Person person8 = new Person("Barbara", LocalDate.of(1988 ,4, 19));

        List<Person> personList = List.of(person1, person2, person3, person4, person5, person6, person7, person8);
        // personList.forEach(System.out::println);

        LocalDate now = LocalDate.of(2020, Month.JUNE, 15);
        personList.stream().forEach(
                p -> {
                    Period period = Period.between(p.getDateOfBirth(), now);
                    System.out.println(p.getName() + " was born " + period.get(ChronoUnit.YEARS) + " years and " + period.get(ChronoUnit.MONTHS) + " months ago"
                    + "[" + p.getDateOfBirth().until(now, ChronoUnit.MONTHS)+" months]");
                }
        );


        LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(nextSunday);



    }
}
