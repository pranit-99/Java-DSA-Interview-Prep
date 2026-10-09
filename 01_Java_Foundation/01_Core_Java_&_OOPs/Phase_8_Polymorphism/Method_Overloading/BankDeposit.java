/*Banking Deposit System
Scenario

A bank application allows customers to deposit money in different ways.

A customer can:

Deposit only an amount
Deposit an amount + account number
Deposit an amount + account number + deposit method

Instead of creating methods such as:

depositAmount()
depositWithAccount()
depositWithMethod()

we want to use the same method name:

deposit()

with different parameters.

Your Task

Create a class:

BankDeposit

Create these three overloaded methods:

deposit(double amount)
deposit(double amount, long accountNumber)
deposit(double amount, long accountNumber, String depositMethod)

The first method should print:

Deposit Amount: $5000.0

The second:

Account Number: 123456789
Deposit Amount: $5000.0

The third:

Account Number: 123456789
Deposit Amount: $5000.0
Deposit Method: Cash
Main Method

Create an object:

BankDeposit bank = new BankDeposit();

and test all three overloaded methods:

bank.deposit(5000);
bank.deposit(5000, 123456789L);
bank.deposit(5000, 123456789L, "Cash");
What you're learning

All three methods have the same name:

deposit()
deposit()
deposit()

But Java distinguishes them through their parameter lists:

deposit(double)
        ↓
      1 parameter


deposit(double, long)
        ↓
      2 parameters


deposit(double, long, String)
        ↓
      3 parameters

This demonstrates the first major overloading rule: */
public class BankDeposit {
    public void deposit(double amount){
        System.out.println("Deposit Amount" + amount);
    }

    public void deposit(double amount, long accountNumber){
        System.out.println("Account Number" + accountNumber);
        System.out.println("Deposit Amount: $" + amount);
    }

    public void deposit(double amount, long accountNumber, String depositMethod){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Deposit Amount: $" + amount);
        System.out.println("Deposit Method: " + depositMethod);
    }

    public static void main(String args[]){
        BankDeposit bank = new BankDeposit();

        System.out.println("Deposit 1");
        bank.deposit(5000);

        System.out.println("---------------------------");

        System.out.println("Deposit 2");
        bank.deposit(10000, 123456789L);

        System.out.println("---------------------------");

        System.out.println("Deposit 3");
        bank.deposit(15000,987654321L, "Cash" );


    }
}
