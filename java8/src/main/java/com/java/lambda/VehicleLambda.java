package com.java.lambda;

public class VehicleLambda {
    public static void main(String[] args) {
        Vechicle vehicle = (int wheelCount) -> wheelCount>0;
        System.out.println(vehicle.hasWheels(5));
        System.out.println(vehicle.hasWheels(0));
    }
}
