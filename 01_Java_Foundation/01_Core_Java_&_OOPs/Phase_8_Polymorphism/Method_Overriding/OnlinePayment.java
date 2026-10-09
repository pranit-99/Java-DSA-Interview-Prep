class Payment {

    public double calculateFee(double amount) {

        return 0;
    }

    public void processPayment(double amount) {

        System.out.println(
                "Processing payment of $" + amount
        );
    }
}


class CreditCardPayment extends Payment {

    @Override
    public double calculateFee(double amount) {

        double fee = amount * 0.02;

        return fee;
    }

    @Override
    public void processPayment(double amount) {

        System.out.println(
                "Processing Credit Card Payment: $" + amount
        );
    }
}


class PayPalPayment extends Payment {

    @Override
    public double calculateFee(double amount) {

        double fee = amount * 0.03;

        return fee;
    }

    @Override
    public void processPayment(double amount) {

        System.out.println(
                "Processing PayPal Payment: $" + amount
        );
    }
}


class BankTransferPayment extends Payment {

    @Override
    public double calculateFee(double amount) {

        double fee = amount * 0.01;

        return fee;
    }

    @Override
    public void processPayment(double amount) {

        System.out.println(
                "Processing Bank Transfer Payment: $" + amount
        );
    }
}

public class OnlinePayment {
    public static void main(String[] args) {

        Payment[] payments = {

                new CreditCardPayment(),

                new PayPalPayment(),

                new BankTransferPayment()
        };


        double amount = 1000;


        for (Payment payment : payments) {

            payment.processPayment(amount);

            double fee =
                    payment.calculateFee(amount);

            System.out.println(
                    "Transaction Fee: $" + fee
            );

            System.out.println("----------------------");
        }
    }
}
