public class ATMTransaction {
    public static void main(String[] args) {
        int balance  = 5000;
        int transactionAmount = 0;

        try {
            System.out.println("Account Balance: $" + balance);
            System.out.println("Transaction Amount: $" + transactionAmount);
            int ratio = balance / transactionAmount;
            System.out.println("Transaction Ratio: " + ratio);
        } catch (ArithmeticException e) {
            System.out.println("Transaction Failed.");
            System.out.println("Reason: Transaction amount cannot be zero.");
        }finally {
            System.out.println("ATM session closed");
        }
        System.out.println("ATM program completed");
    }
}
