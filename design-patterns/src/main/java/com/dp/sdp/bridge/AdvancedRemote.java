package com.dp.sdp.bridge;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }
}
