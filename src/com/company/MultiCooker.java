package com.company;

public abstract class MultiCooker extends AbstractDevice {

    public MultiCooker(String name, String serialNum) {
        super(name, serialNum);
    }

    public MultiCooker() {
        // EMPTY
    }

    public void powerOn(){
        System.out.println("Powering On ..." + "\nLet's cook blue meth $$$");
    }

    public void powerOff() {
        System.out.println("Powering Off ..." + "\nGus Fring says: 'More...'");
    }

    public abstract void cook();

}
