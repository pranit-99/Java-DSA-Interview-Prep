/*Problem 5: Bank Interest System

Now we'll use an interface where different classes perform different calculations using the same method contract.

Problem Statement

Create a banking system that calculates annual interest for different account types.

Requirements:

Create an interface Bank.
Declare double calculateInterest(double balance).
Create SavingsAccount implementing Bank.
Create CurrentAccount implementing Bank.
Savings account interest rate = 4%.
Current account interest rate = 2%.
Use interface references in main(). */
interface Bank{
    double calculateInterest(double balance);
}

class SavingsAccount implements Bank{
    @Override
    public double calculateInterest(double balance){
        double interestRate = 0.04;
        return balance * interestRate;
    }
}

class CurrentAccount implements Bank {

    @Override
    public double calculateInterest(double balance) {
        double interestRate = 0.02;
        return balance * interestRate;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Bank savings = new SavingsAccount();

        Bank current = new CurrentAccount();

        double savingsInterest = savings.calculateInterest(10000);

        double currentInterest = current.calculateInterest(10000);

        System.out.println("Savings Account Interest: $" + savingsInterest);

        System.out.println("Current Account Interest: $" + currentInterest);
    }
}
