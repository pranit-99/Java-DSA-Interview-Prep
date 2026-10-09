/*Problem Statement

An online payment system receives the payment amount as a String.

Normally:

String paymentAmount = "2500";

The system converts it:

int amount = Integer.parseInt(paymentAmount);

But suppose the received value is:

String paymentAmount = "2500USD";

Your program should:

Store "2500USD" in a String.
Print "Payment Processing Started".
Convert the String into an int.
Calculate a $100 processing fee.
Display the total payment.
Handle the exception if conversion fails.
Print "Payment Processing Completed". */
public class PaymentAmountParser {

    public static void main(String[] args) {

        String paymentAmount = "2500USD";

        System.out.println("Payment Processing Started");

        try {

            int amount =Integer.parseInt(paymentAmount);
            int processingFee = 100;
            int totalPayment =amount + processingFee;

            System.out.println("Payment Amount: $" + amount);
            System.out.println("Processing Fee: $" + processingFee);
            System.out.println("Total Payment: $" + totalPayment);

        } catch (NumberFormatException e) {

            System.out.println("Invalid payment amount.");
            System.out.println("Please enter numbers only.");
        }

        System.out.println("Payment Processing Completed");
    }
}