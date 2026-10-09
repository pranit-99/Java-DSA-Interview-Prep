/*Bank Account Management
Problem Statement
A banking application needs to manage a customer's bank account.
Create a class called:
BankAccount
The account should maintain:
accountHolderName
accountNumber
balance

The following rules must be followed:
All account information must be private.
Account holder name can be changed using a setter.
Account number can be viewed but should not be directly changed after being assigned.
Balance can be viewed but should not have a setter.
A customer can deposit money.
Deposit amount must be greater than 0.
A customer can withdraw money.
Withdrawal amount must be greater than 0.
Withdrawal cannot exceed the available balance.
Display an appropriate message for successful or rejected transactions.

Since we haven't learned constructors yet, we'll assign the account number through a normal method for this exercise. */
public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public void setAccountHolderName(String accountHolderName){
        if(accountHolderName != null && !accountHolderName.isEmpty()){
            this.accountHolderName = accountHolderName;
        }else{
            System.out.println("Invalid account holder name");
        }
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountNumber(String accountNumber){
        if(this.accountNumber == null){
            this.accountNumber = accountNumber;
        }else{
            System.out.println("Account Number cannot be chaanged");
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
            System.out.println("Deposit Successful");
            System.out.println("Amount deposited: $"+amount);
        }else{
            System.out.println("Deposit amount must be greater than Zero");
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Withdrawal amount must be greater than 0");
        }else if(amount > this.balance){
            System.out.println("Insufficient Balannce");
        }else{
            this.balance = this.balance - amount;
            System.out.println("Withdraw Successful");
            System.out.println("Amount Withdrawn: $"+ amount);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolderName("Pranit Mhatre");
        account.setAccountNumber("ACC1001");
        account.deposit(5000);
        account.withdraw(1200);
        System.out.println();
        System.out.println("Account Holder: "+account.getAccountHolderName());
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Account Balance: "+account.getBalance());
    }
    
}
