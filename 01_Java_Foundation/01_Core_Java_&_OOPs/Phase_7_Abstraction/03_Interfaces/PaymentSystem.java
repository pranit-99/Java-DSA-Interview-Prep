/*Basic Interface — Problem 1: Payment System
Problem Statement

A payment application needs to process different types of payments.

For now, create:

An interface called Payment.
Declare a method pay(double amount).
Create a class CreditCardPayment that implements Payment.
Provide the actual payment implementation inside CreditCardPayment.
In the main class, use an interface reference to call the payment method. */
interface Payment{
    void pay(double amount);
}

class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Payment Amount: $" + amount);
        System.out.println("Payment Successful");
    }
}
public class PaymentSystem {
    public static void main(String args[]){
        Payment payment = new CreditCardPayment();
        payment.pay(500.00);
    }
}
