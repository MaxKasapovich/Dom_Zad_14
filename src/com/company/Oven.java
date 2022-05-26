package com.company;

public class Oven extends MultiCooker {

    public Oven(String name, String serialNum) {
        super(name, serialNum);
    }

    public Oven() {
        // EMPTY
    }

    @Override
    public void cook() {
        System.out.println("Oven is ON...");
    }

    public void initTimer(int timerCount) {
        System.out.println("Cooking will end in " + timerCount + " minutes" + "\nGet your ass up here by that time!");
        cook();
    }
}
