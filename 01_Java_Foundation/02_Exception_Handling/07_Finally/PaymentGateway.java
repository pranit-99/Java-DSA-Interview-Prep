public class PaymentGateway {
    public static void main(String[] args) {

        int totalAmount = 5000;
        int installments = 0;

        try {

            System.out.println("Payment gateway opened.");
            System.out.println("Total Amount: $" + totalAmount);
            int installmentAmount = totalAmount / installments;
            System.out.println(
                "Installment Amount: $" + installmentAmount
            );
            System.out.println("Payment processed successfully.");

        } catch (ArithmeticException e) {

            System.out.println("Payment Processing Failed.");
            System.out.println(
                "Reason: Number of installments cannot be zero."
            );

        } finally {

            System.out.println("Payment gateway session closed.");
        }

        System.out.println("Payment program completed.");
    }
}
