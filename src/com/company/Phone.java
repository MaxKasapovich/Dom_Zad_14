package com.company;

public abstract class Phone extends AbstractDevice {

    public Phone(String name, String serialNum) {
        super(name, serialNum);
    }

    public Phone() {
        // EMPTY
    }

    public abstract void call();

}
