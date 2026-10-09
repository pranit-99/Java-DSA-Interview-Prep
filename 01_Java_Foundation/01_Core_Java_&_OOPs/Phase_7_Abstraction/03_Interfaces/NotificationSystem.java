/*Problem 3: Notification System

This problem reinforces:

One interface → multiple implementations → caller uses the interface without needing to know the internal notification logic.

Problem Statement

Create a notification system that can send notifications through Email and SMS.

Requirements:

Create an interface Notification.
Declare void sendMessage(String message).
Create EmailNotification implementing Notification.
Create SMSNotification implementing Notification.
Each class should implement sendMessage() differently.
In main(), use interface references.
Complete Solution */
interface Notification{
    void sendMessage(String message);
}

class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending Email...");
        System.out.println("Email Message: " + message);
    }
}

class SMSNotification implements Notification{
    @Override 
    public void sendMessage(String message){
        System.out.println("Sending SMS...");
        System.out.println("SMS Message:" + message);
    }
}
public class NotificationSystem {
    public static void main(String[] args) {

        Notification notification1 = new EmailNotification();
        Notification notification2 = new SMSNotification();
        notification1.sendMessage("Your order has been shipped.");
        notification2.sendMessage("Your OTP is 458921.");
 }
}
