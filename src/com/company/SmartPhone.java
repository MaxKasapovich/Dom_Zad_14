package com.company;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;
    private String message;

    public SmartPhone(String name, String serialNum, int simCount, String os) {
        super(name, serialNum, simCount);
        this.os = os;
    }

    public SmartPhone(int simCount, String os) {
        super(simCount);
        this.os = os;
    }

    public SmartPhone() {
        // EMPTY
    }

    public String getOs() {
        return os;
    }

    public void runApp() {
        System.out.println("The application is starting ...");
    }

    @Override
    public String editMail(String text) {
        System.out.println("Initial message: " +  message);
        message = text;
        System.out.println("Changed message: " +  message);
        return message;
    }

    @Override
    public String createMail(String text) {
        message = text;
        return message;
    }

    @Override
    public void sendMail(String msg) {
        System.out.println("(Message:) " +  msg +  "  (has been sent.)");

    }

    public String getMessage() {
        return message;
    }
}

