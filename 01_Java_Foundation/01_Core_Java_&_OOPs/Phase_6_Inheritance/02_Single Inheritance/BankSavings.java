/*In this problem, a child method will use a variable inherited from the parent to perform a calculation.

Concept
BankAccount
     ↑
SavingsAccount

A SavingsAccount IS-A BankAccount.

Problem Statement

Create a Java program using single-level inheritance.

Parent class — BankAccount

Variables:

String accountHolder;
double balance;

Method:

void displayAccountDetails()

It should display the account holder and current balance.

Child class — SavingsAccount

Inherit BankAccount.

Add:

double interestRate;

Create:

void calculateInterest()

The method should calculate:

Interest = balance × interestRate / 100

Notice something important:

balance belongs to the parent class, but we're going to use it directly inside the child class method.

Test Data

Use:

Account Holder: Pranit
Balance: $10000
Interest Rate: 5%

Expected interest:

10000 × 5 / 100
= $500
Expected Output
Account Holder: Pranit
Account Balance: $10000.0
Interest Rate: 5.0%
Interest Earned: $500.0 */
class BankAccount{
    String accountHolder;
    double balance;

    void displayAccountDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: $"+ balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    void calculateInterest(){
        double interest = balance * interestRate / 100;

        System.out.println("Interest Rate: " +interestRate + "%");
        System.out.println("Interest Earned: $"+interest);
    }  
}

public class BankSavings{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.accountHolder = "Pranit";
        account.balance = 10000;
        account.interestRate = 5;

        account.displayAccountDetails();
        account.calculateInterest();
    }
}
