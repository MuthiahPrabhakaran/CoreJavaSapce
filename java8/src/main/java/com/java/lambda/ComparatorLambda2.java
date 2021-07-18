package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda2 {
    public static void main(String[] args) {
        Student s1 = new Student(13, "Ashwin", "Madurai");
        Student s2 = new Student(9, "Zeb", "Chennai");
        Student s3 = new Student(15, "Xenon", "Hosur");
        Student s4 = new Student(11, "Bob", "Bangalore");

        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);
        /*Comparator<Student> ageComparator = (o1, o2) -> {
            return Integer.compare(o1.getAge(), o2.getAge());
        };*/
        Comparator<Student> ageComparator = Comparator.comparingInt(Student::getAge).thenComparing(Student::getName);
        Collections.sort(studentList, ageComparator);
        System.out.println(studentList);
    }
}
class Student {
    private int age;
    private String name;
    private String city;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
