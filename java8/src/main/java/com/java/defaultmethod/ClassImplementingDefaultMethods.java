package com.java.defaultmethod;

public class ClassImplementingDefaultMethods implements InterfaceA, InterfaceB {
    /*
     * Duplicate default methods named defaultMethod with the parameters () and () are inherited
     * from the types InterfaceB and InterfaceA This error will be thrown when we don't implement
     * defaultMethod()
     */

    public void defaultMethod() {
        System.out.println("Default Method");
        InterfaceA.super.defaultMethod(); //optional
    }
    
}
