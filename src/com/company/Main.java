package com.company;

public class Main {

    public static void main(String[] args) {

        SmartPhone smart1 = new SmartPhone();
        smart1.powerOn();
        smart1.call();
        smart1.runApp();
        smart1.createMail("Hello. Unfortunately, the war has been started ... ((");
        smart1.editMail("Hey there ... We are pleased to announce that the war is over.");
        smart1.sendMail(smart1.getMessage());

        Oven oven1 = new Oven();
        oven1.powerOn();
        oven1.initTimer(68);
        oven1.powerOff();

        switchAll(smart1,oven1);
        sendAll(smart1);
    }

    public static void switchAll(AbstractDevice ... devices) {
        for(AbstractDevice device:devices) {
            device.powerOff();
        }
    }

    public static void sendAll(MailSender ... mails) {
        for(MailSender mail:mails) {
            mail.sendMail("Bye, see you soon under the peaceful sky ...");
        }
    }
}
