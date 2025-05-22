package org.codewithmosh;

public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
