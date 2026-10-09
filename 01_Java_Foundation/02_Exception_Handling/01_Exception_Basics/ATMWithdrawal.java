/*ATM Withdrawal Analyzer — ArithmeticException

For this first problem, our main goal is not just to use try-catch, but to understand exactly what an exception does to program execution.

Problem Statement

An ATM system stores:

Total amount withdrawn = $6000
Number of withdrawals = 0

The system wants to calculate:

Average Withdrawal = Total Amount / Number of Withdrawals

Because the number of withdrawals is 0, Java will encounter a problem.

Your program should:

Print "ATM Analysis Started"
Store total withdrawn amount as 6000
Store number of withdrawals as 0
Try to calculate the average withdrawal
Handle the problem without allowing the entire program to terminate
Print "ATM Analysis Completed" after handling the problem */
public class ATMWithdrawal {
    public static void main(String args[]){
        int totalAmount = 5000;
        int numberOfWithdrawals = 0;

        System.out.println("ATM Analysis Started");
        try {
            int averageWithdrawal  = totalAmount / numberOfWithdrawals;
            System.out.println("Average Withdrawal: " + averageWithdrawal);
        } catch (ArithmeticException e) {
            System.out.println("Number of withdrawals cannot be zero.");
        }
        System.out.println("ATM Analysis Completed");
    }
}
