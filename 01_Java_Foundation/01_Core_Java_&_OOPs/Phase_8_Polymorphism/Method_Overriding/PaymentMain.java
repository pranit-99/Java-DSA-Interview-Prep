/*Payment System — final, private, and static Methods

This problem is important because not every parent method can participate in normal runtime overriding.

We'll learn three rules:

final method   → Cannot be overridden
private method → Cannot be overridden
static method  → Hidden, not overridden
Problem Statement

Suppose we have a payment system:

Payment
   |
   └── CreditCardPayment

The parent Payment class contains four types of methods:

processPayment()      // normal instance method
securityCheck()       // final
validatePIN()         // private
paymentProvider()     // static

We'll see what the child class can and cannot override. */

class Payment{
    // Normal method - can be overridden
    public void processPayment(){
        System.out.println("Processing General Payment");
    }

    // Final method - cannot be overridden
    public final void securityCheck(){
        System.out.println("Performing Standard Security Check");
    }

    // Private method - not visible to child
    private void validatePIN(){
        System.out.println("Validating PIN");
    }

    // Static method - hidden, not overridden
    public static void paymentProvider(){
        System.out.println("General Payment Provider");
    }
}

class CreditCardPayment extends Payment{
    //Normal overriding
    @Override
    public void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }

    // This is a separate child method.
    // It does NOT override Payment.validatePIN()
    public void validatePIN() {

        System.out.println("Validating Credit Card PIN");
    }

    // Static method hiding
    public static void paymentProvider() {

        System.out.println("Credit Card Payment Provider");
    }
}
public class PaymentMain {
    public static void main(String args[]){
        Payment payment = new CreditCardPayment();
        //Runtime Overriding
        payment.processPayment();

        //Inherited final method
        payment.securityCheck();

        //Static method
        Payment.paymentProvider();

        CreditCardPayment.paymentProvider();
    }
}
