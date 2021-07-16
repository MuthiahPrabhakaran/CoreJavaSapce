package com.dp.sdp.bridge;

public class SonyRemote implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony TV:Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV:Turn Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony TV:Channel " + number);
    }
}
