package com.java.defaultmethod;

interface Interface1 {
    default void method1() {
        System.out.println("Method in Interface1");
    }
}

interface Interface2 {
    default void method1() {
        System.out.println("Method in Interface2");
    }
}

class Class1 implements Interface1, Interface2{

    @Override
    public void method1() {
        Interface1.super.method1();
        Interface2.super.method1();
    }

}

public class MultipleInheritance {

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.method1();
    }
}