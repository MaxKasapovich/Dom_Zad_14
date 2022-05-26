package com.company;

public abstract class AbstractDevice {

    private String name;
    private String serialNum;

    public abstract void powerOn();
    public abstract void powerOff();

    public AbstractDevice(String name, String serialNum) {
        this.name = name;
        this.serialNum = serialNum;
    }

    public AbstractDevice() {
        powerOn();
    }

    public String getName() {
        return name;
    }

    public String getSerialNum() {
        return serialNum;
    }
}


