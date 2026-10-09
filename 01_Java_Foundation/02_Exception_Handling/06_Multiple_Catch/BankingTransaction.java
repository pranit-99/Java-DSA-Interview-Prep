public class BankingTransaction {
    public static void main(String[] args) {
        String transactionAmount = "500";
        int numberOfInstallments = 0;

        try {
            int amount = Integer.parseInt(transactionAmount);
            System.out.println("Transaction Amount: $" +amount);
            int installmentAmount = amount / numberOfInstallments;
            System.out.println("Installment Amount: $" + installmentAmount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid transaction amount.");
            System.out.println("Please enter a numeric amount.");
        }catch (ArithmeticException e){
            System.out.println("Cannot calculate installment amount.");
            System.out.println("Number of installments cannot be zero.");
        }
        System.out.println("Transaction processing completed");
    }
}
