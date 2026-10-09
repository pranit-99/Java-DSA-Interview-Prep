/*ATM Withdrawal
Problem Statement

Create a Java program for an ATM.

The user has:

Account Balance = $5000
Withdrawal Amount = $0

Your program should:

Store the account balance.
Ask/set a withdrawal amount.
Calculate the remaining balance.
Use try-catch to handle an ArithmeticException.
For practice, calculate a withdrawal ratio:
balance / withdrawalAmount

If the withdrawal amount is 0, Java will throw an ArithmeticException. */
public class ATM_Withdrawal {
    public static void main(String[] args) {
        int accountBalance = 5000;
        int withdrawalAmount = 0;

        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("Withdrawal Amount: $" + withdrawalAmount);

        try {
            int withdrawalRatio = accountBalance / withdrawalAmount;
            System.out.println("Withdrawal Ratio: " + withdrawalRatio);
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate withdrawal ratio");
            System.out.println("Reason: Withdrawal amount cannot be zero.");
        }
        System.out.println("ATM program completed successfully.");
    }
}
