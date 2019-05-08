package com.java.defaultmethod;

public interface InterfaceA {
    
    public default void defaultMethod() {
        System.out.println("Interface A");
    }
}
