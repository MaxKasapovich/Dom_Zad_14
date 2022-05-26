package com.company;

public class Stove extends MultiCooker {

    public Stove(String name, String serialNum) {
        super(name, serialNum);
    }

    public Stove() {
        // EMPTY
    }

    @Override
    public void cook() {
        System.out.println("Cooking in progress...");
    }

    public void switchProgram(int programNum) {
        System.out.println("Cooking with parameters of program № " + programNum + " has been started...");
        cook();
    }
}
