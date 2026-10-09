/*Guided Problem 3 — Bank Account System

Now we'll introduce the next important concept:

An abstract class can contain both abstract methods and normal (concrete) methods.

This is one of the biggest reasons to use an abstract class instead of only an interface.

Problem Statement

A bank has different types of accounts:

SavingsAccount
CurrentAccount

Every account calculates interest differently. However, displaying the bank name is the same for every account.

Create an abstract class:

BankAccount

It should contain:

abstract void calculateInterest(double balance);

and one normal method:

void displayBankName()

The bank name should be:

ABC Bank

Create two child classes:

SavingsAccount
CurrentAccount

Use these basic rules:

Savings Account → 5% interest
Current Account → 2% interest

Use a balance of:

10000
Expected Output
Welcome to ABC Bank
Savings Account Interest: $500.0

Welcome to ABC Bank
Current Account Interest: $200.0 */
abstract class BankAccount{
    @SuppressWarnings("unused")
    abstract void calculateInterest(double balance);

    void displayBankName(){
        System.out.println("Welcome to ABC Bank ");
    }
}

class SavingAccount extends BankAccount{

    @Override
    void calculateInterest(double balance){
        double interest = balance * 0.05;
        System.out.println("Savings Account Interest: $" + interest);
    }
}

class CurrentAccount extends BankAccount{

    @Override
    void calculateInterest(double balance){
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: $" +interest);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount();
        CurrentAccount current = new CurrentAccount();

        savings.displayBankName();
        savings.calculateInterest(10000);
        System.out.println();
        current.displayBankName();
        current.calculateInterest(10000);
    }
    
}
