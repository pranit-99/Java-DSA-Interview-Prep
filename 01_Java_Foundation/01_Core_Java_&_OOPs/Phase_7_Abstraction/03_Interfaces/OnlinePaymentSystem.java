/*Problem 8: Online Payment System

This is our final Basic Interface problem. We'll combine interface references, multiple implementations, parameters, return values, and abstraction.

Problem Statement

Create an online payment system supporting Card Payment and PayPal Payment.

Create:

interface OnlinePayment

with two methods:

boolean validatePayment(double amount);

void processPayment(double amount);

Then create:

CardPayment
PayPalPayment

Both should implement OnlinePayment, but each should have its own validation and processing logic. */
interface OnlinePayment {

    boolean validatePayment(double amount);

    void processPayment(double amount);

}


class CardPayment implements OnlinePayment {

    @Override
    public boolean validatePayment(double amount) {

        return amount > 0 && amount <= 5000;
    }


    @Override
    public void processPayment(double amount) {

        if (validatePayment(amount)) {

            System.out.println("Processing Card Payment...");
            System.out.println("Amount: $" + amount);
            System.out.println("Card Payment Successful");

        } else {

            System.out.println("Invalid Card Payment");

        }
    }
}


class PayPalPayment implements OnlinePayment {

    @Override
    public boolean validatePayment(double amount) {

        return amount > 0 && amount <= 10000;
    }


    @Override
    public void processPayment(double amount) {

        if (validatePayment(amount)) {

            System.out.println("Processing PayPal Payment...");
            System.out.println("Amount: $" + amount);
            System.out.println("PayPal Payment Successful");

        } else {

            System.out.println("Invalid PayPal Payment");

        }
    }
}


public class OnlinePaymentSystem {

    public static void main(String[] args) {

        OnlinePayment payment1 = new CardPayment();

        OnlinePayment payment2 = new PayPalPayment();


        payment1.processPayment(3000);

        System.out.println("----------------------");

        payment2.processPayment(7000);

    }
}
