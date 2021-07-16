package com.dp.sdp.bridge;

public class Main {
    public static void main(String[] args) {
        var device = new BasicRemote(new SonyRemote());
        device.turnOn();
        device.turnOff();

        var anotherDevice = new AdvancedRemote(new SonyRemote());
        anotherDevice.turnOn();
        anotherDevice.turnOff();
        anotherDevice.setChannel(10);
    }
}
