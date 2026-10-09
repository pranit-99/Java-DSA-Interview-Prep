/*Basic Problem 8 of 8 — BankAccount → SavingsAccount

This is our final Basic Single-Level Inheritance problem. We'll combine the concepts from Problems 1–7 without introducing overriding or polymorphism yet.

Concepts Combined
✓ extends
✓ Parent fields
✓ Child fields
✓ protected
✓ Parent constructor
✓ Child constructor
✓ super(...)
✓ Inherited method
✓ Child uses inherited fields
✓ Child-specific calculation
Problem Statement

Build a simple banking application.

Parent Class — BankAccount

Create these protected fields:

protected String accountHolder;
protected String accountNumber;
protected double balance;

Create a parameterized constructor:

BankAccount(
    String accountHolder,
    String accountNumber,
    double balance
)

Create:

void displayAccountDetails()

to display the account information.

Child Class — SavingsAccount

Inherit BankAccount.

Add:

private double interestRate;

Create a constructor:

SavingsAccount(
    String accountHolder,
    String accountNumber,
    double balance,
    double interestRate
)

Use:

super(accountHolder, accountNumber, balance);

to initialize the parent portion.

Create:

void calculateInterest()

and:

void displaySavingsAccount()

The child should calculate:

Interest = Balance × Interest Rate / 100

and:

Balance After Interest = Balance + Interest
Test Data

Use:

Account Holder: Pranit Mhatre
Account Number: SAV101
Balance: $15000
Interest Rate: 5%

Calculation:

Interest
= 15000 × 5 / 100
= $750

Balance After Interest
= 15000 + 750
= $15750
Expected Output
Account Holder: Pranit Mhatre
Account Number: SAV101
Current Balance: $15000.0
Interest Rate: 5.0%
Interest Earned: $750.0
Balance After Interest: $15750.0 */
class BankAccount {

    protected String accountHolder;
    protected String accountNumber;
    protected double balance;


    BankAccount(
        String accountHolder,
        String accountNumber,
        double balance
    ) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    void displayAccountDetails() {

        System.out.println(
            "Account Holder: " + accountHolder
        );

        System.out.println(
            "Account Number: " + accountNumber
        );

        System.out.println(
            "Current Balance: $" + balance
        );
    }
}


class SavingsAccount extends BankAccount {

    private double interestRate;


    SavingsAccount(
        String accountHolder,
        String accountNumber,
        double balance,
        double interestRate
    ) {

        super(
            accountHolder,
            accountNumber,
            balance
        );

        this.interestRate = interestRate;
    }


    void calculateInterest() {

        double interest =
            balance * interestRate / 100;

        double balanceAfterInterest =
            balance + interest;

        System.out.println(
            "Interest Rate: " + interestRate + "%"
        );

        System.out.println(
            "Interest Earned: $" + interest
        );

        System.out.println(
            "Balance After Interest: $"
            + balanceAfterInterest
        );
    }


    void displaySavingsAccount() {

        displayAccountDetails();

        calculateInterest();
    }
}


public class BankSavingsAccount {

    public static void main(String[] args) {

        SavingsAccount account =
            new SavingsAccount(
                "Pranit Mhatre",
                "SAV101",
                15000,
                5
            );

        account.displaySavingsAccount();
    }
}
