/*Digital Wallet / Payment Account

This is our final guided encapsulation problem. We'll combine several ideas from Problems 1–4:

private data
validation
controlled balance
transaction limits
account status
preventing operations based on state
methods that represent real business operations

Still no constructors.

Problem Statement

A digital payment company needs a system to manage customer wallets.

Create a class:

DigitalWallet

Each wallet should maintain:

walletId
ownerName
balance
dailySpendingLimit
accountActive
Business Rules
All fields must be private.
walletId can be assigned only once.
ownerName can be viewed and changed.
balance can be viewed but must not have a setter.
Money can be added using addMoney().
Payments can be made using makePayment().
Added money must be greater than 0.
Payment amount must be greater than 0.
Payment cannot exceed the available balance.
Payment cannot exceed the daily spending limit.
Daily spending limit must be greater than 0.
The wallet can be activated or deactivated.
A payment cannot be made if the wallet is inactive. */
public class DigitalWallet {

    private int walletId;
    private String ownerName;
    private double balance;
    private double dailySpendingLimit;
    private boolean accountActive;


    public void setWalletId(int walletId) {

        if(this.walletId == 0 && walletId > 0) {

            this.walletId = walletId;

        } else {

            System.out.println(
                "Invalid Wallet ID or Wallet ID already assigned"
            );
        }
    }


    public int getWalletId() {
        return walletId;
    }


    public void setOwnerName(String ownerName) {

        if(ownerName != null && !ownerName.isEmpty()) {

            this.ownerName = ownerName;

        } else {

            System.out.println("Invalid owner name");
        }
    }


    public String getOwnerName() {
        return ownerName;
    }


    public double getBalance() {
        return balance;
    }


    public void setDailySpendingLimit(double dailySpendingLimit) {

        if(dailySpendingLimit > 0) {

            this.dailySpendingLimit = dailySpendingLimit;

        } else {

            System.out.println(
                "Daily spending limit must be greater than 0"
            );
        }
    }


    public double getDailySpendingLimit() {
        return dailySpendingLimit;
    }


    public void activateWallet() {

        this.accountActive = true;

        System.out.println("Wallet activated successfully");
    }


    public void deactivateWallet() {

        this.accountActive = false;

        System.out.println("Wallet deactivated successfully");
    }


    public boolean isAccountActive() {
        return accountActive;
    }


    public void addMoney(double amount) {

        if(amount > 0) {

            this.balance = this.balance + amount;

            System.out.println("Money added successfully");
            System.out.println("Amount Added: $" + amount);

        } else {

            System.out.println(
                "Amount must be greater than 0"
            );
        }
    }


    public void makePayment(double amount) {

        if(!this.accountActive) {

            System.out.println(
                "Payment failed: Wallet is inactive"
            );

        } else if(amount <= 0) {

            System.out.println(
                "Payment amount must be greater than 0"
            );

        } else if(amount > this.dailySpendingLimit) {

            System.out.println(
                "Payment exceeds daily spending limit"
            );

        } else if(amount > this.balance) {

            System.out.println(
                "Payment failed: Insufficient balance"
            );

        } else {

            this.balance = this.balance - amount;

            System.out.println("Payment successful");
            System.out.println("Amount Paid: $" + amount);
        }
    }


    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet();

        wallet.setWalletId(1001);
        wallet.setOwnerName("Pranit Mhatre");

        wallet.setDailySpendingLimit(1000);

        wallet.activateWallet();

        wallet.addMoney(3000);

        System.out.println();
        System.out.println("Balance before payment: $"
                           + wallet.getBalance());

        wallet.makePayment(700);

        System.out.println();
        System.out.println("Wallet Details");

        System.out.println(
            "Wallet ID: " + wallet.getWalletId()
        );

        System.out.println(
            "Owner: " + wallet.getOwnerName()
        );

        System.out.println(
            "Daily Limit: $" + wallet.getDailySpendingLimit()
        );

        System.out.println(
            "Wallet Active: " + wallet.isAccountActive()
        );

        System.out.println(
            "Current Balance: $" + wallet.getBalance()
        );
    }
}
