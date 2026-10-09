public class BankWithdrawal {
    public static void main(String[] args) {
        double balance  = 5000;
        double withdrawalAmount = 7000;

        try {
            System.out.println("Available Balance: $" +balance);
            System.out.println("Withdrawal Amount: $" + withdrawalAmount);

            if(withdrawalAmount > balance){
                throw new IllegalArgumentException("Insufficient balance for withdrawal");
            }
            balance = balance - withdrawalAmount;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: $" + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Transaction Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Banking operation completed.");
    }
}
