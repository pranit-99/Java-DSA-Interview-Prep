abstract class Payment {

    abstract void processPayment(double amount);
}


class CreditCardPayment extends Payment {

    @Override
    void processPayment(double amount) {

        System.out.println(
            "Processing Credit Card Payment: $" + amount
        );
    }
}


class PayPalPayment extends Payment {

    @Override
    void processPayment(double amount) {

        System.out.println(
            "Processing PayPal Payment: $" + amount
        );
    }
}


class BankTransferPayment extends Payment {

    @Override
    void processPayment(double amount) {

        System.out.println(
            "Processing Bank Transfer Payment: $" + amount
        );
    }
}


public class PaymentSystem {

    public static void main(String[] args) {

        Payment payment1 =
                new CreditCardPayment();

        Payment payment2 =
                new PayPalPayment();

        Payment payment3 =
                new BankTransferPayment();


        payment1.processPayment(500);

        payment2.processPayment(750);

        payment3.processPayment(1000);
    }
}