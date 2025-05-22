package org.codewithme;

public class Main {
    public static void main(String[] args) {

        Notifier email = new Notifier( new EmailService());
            email.sendN(" This is our email to you");
        Notifier sms = new Notifier(new SmsNotification());
        sms.sendN("This is our sms message to you ");
    }
}