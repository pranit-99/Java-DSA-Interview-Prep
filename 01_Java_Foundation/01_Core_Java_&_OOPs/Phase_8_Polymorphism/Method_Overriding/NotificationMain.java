/*Customer Notification System — Access Modifier Rule

Now we'll specifically practice an important overriding rule:

While overriding, the child method cannot have a more restrictive access modifier than the parent method.

We'll use:

protected → public   ✅
public → protected   ❌
Problem Statement

Suppose a company's notification system has a parent class:

Notification

with:

protected void sendMessage(String message)

Different notification services inherit from it:

Notification
     |
     ├── EmailNotification
     |
     └── SMSNotification

The child classes will override sendMessage() and change its access modifier from:

protected

to:

public

This is valid because we're increasing visibility. */
class Notification {

    protected void sendMessage(String message) {

        System.out.println(
                "General Notification: " + message
        );
    }
}


class EmailNotification extends Notification {

    @Override
    public void sendMessage(String message) {

        System.out.println(
                "Email Sent: " + message
        );
    }
}


class SMSNotification extends Notification {

    @Override
    public void sendMessage(String message) {

        System.out.println(
                "SMS Sent: " + message
        );
    }
}


public class NotificationMain {

    public static void main(String[] args) {

        Notification notification1 =
                new EmailNotification();

        Notification notification2 =
                new SMSNotification();


        notification1.sendMessage(
                "Your order has been shipped."
        );

        notification2.sendMessage(
                "Your OTP is 458921."
        );
    }
}
