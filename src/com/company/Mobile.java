package com.company;

public class Mobile extends Phone{

    private int simCount;

    public Mobile(String name, String serialNum, int simCount) {
        super(name, serialNum);
        this.simCount = simCount;
    }

    public Mobile(int simCount) {
        this.simCount = simCount;
    }

    public Mobile() {
        // EMPTY
    }

    @Override
    public void powerOn() {
        System.out.println("Powering On ...");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering Off ...");
    }

    @Override
    public void call() {
        System.out.println("Dialing number ...");
    }

    public int getSimCount() {
        return simCount;
    }
}
