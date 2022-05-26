package com.company;

public class DialPhone extends Phone {

    private boolean hasAnswerPhone;

    public DialPhone(String name, String serialNum, boolean hasAnswerPhone) {
        super(name, serialNum);
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public DialPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public DialPhone() {
        // EMPTY
    }

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void call() {

    }
}
