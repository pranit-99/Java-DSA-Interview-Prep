class BankAccount {

    protected String accountHolder;
    protected double balance;

    void displayAccount() {

        System.out.println(
            "Account Holder: " + accountHolder
        );

        System.out.println(
            "Balance: $" + balance
        );
    }
}


class SavingsAccount extends BankAccount {

    double interestRate;

    void calculateInterest() {

        double interest =
            balance * interestRate / 100;

        System.out.println(
            "Interest Earned: $" + interest
        );
    }
}


class CurrentAccount extends BankAccount {

    double overdraftLimit;

    void displayOverdraft() {

        System.out.println(
            "Overdraft Limit: $" + overdraftLimit
        );
    }
}


public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount();

        savings.accountHolder = "Aarav";
        savings.balance = 10000;
        savings.interestRate = 5;

        savings.displayAccount();
        savings.calculateInterest();

        System.out.println("----------------");

        CurrentAccount current =
            new CurrentAccount();

        current.accountHolder = "Rohan";
        current.balance = 20000;
        current.overdraftLimit = 5000;

        current.displayAccount();
        current.displayOverdraft();
    }
}
