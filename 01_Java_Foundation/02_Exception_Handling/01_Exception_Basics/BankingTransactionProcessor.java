/*Banking Transaction Processor — Continue Execution After Exception

In Problem 7, we'll focus on an important concept:

After an exception is handled by catch, Java continues executing the statements that come after the entire try-catch block.

Problem Statement

A banking application processes a customer's withdrawal.

Customer details:

Customer Name       → Rahul
Account Balance     → $10,000
Withdrawal Amount   → $2,000
Installments        → 0

The bank wants to calculate:

Amount per installment
=
Withdrawal Amount / Installments

Since:

Installments = 0

an ArithmeticException occurs.

However, the application still needs to:

display the customer's balance,
print the transaction status,
complete the banking session. */
public class BankingTransactionProcessor {

    public static void main(String[] args) {

        String customerName = "Rahul";

        int accountBalance = 10000;
        int withdrawalAmount = 2000;
        int installments = 0;

        System.out.println(
            "Banking Transaction Started"
        );

        System.out.println(
            "Customer: " + customerName
        );

        try {

            System.out.println(
                "Processing withdrawal..."
            );

            int amountPerInstallment =
                withdrawalAmount / installments;

            System.out.println(
                "Amount Per Installment: $"
                + amountPerInstallment
            );

        } catch (ArithmeticException e) {

            System.out.println(
                "Transaction calculation failed."
            );

            System.out.println(
                "Installments cannot be zero."
            );
        }

        System.out.println(
            "Current Balance: $"
            + accountBalance
        );

        System.out.println(
            "Banking Transaction Completed"
        );
    }
}
