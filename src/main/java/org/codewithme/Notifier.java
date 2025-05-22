package org.codewithme;

public class Notifier {

   private NotificationService NotificationService;
   public Notifier(NotificationService NotificationService) {
       this.NotificationService = NotificationService;
   }
    public void sendN(String message) {
       NotificationService.send(message);
   }

}
