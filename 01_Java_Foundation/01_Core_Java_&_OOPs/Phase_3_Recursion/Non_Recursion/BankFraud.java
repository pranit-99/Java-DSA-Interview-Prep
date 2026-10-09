/*Bank Fraud Detection

A bank records the amounts of transactions made from a customer's account:

int[] transactions = {120, 450, 300, 2500, 700, 150};

The bank has a simple security rule:

If any single transaction is greater than $2000, the account should be flagged for review.

Create:

public static boolean hasSuspiciousTransaction(int[] transactions)
Expected behavior

For: */
public class BankFraud {
    public static boolean hasSuspiciousTransaction(int transactions[]){
    for(int i = 0; i < transactions.length; i++){
        if(transactions[i] > 200){
            return true;
        }
    }
    return false;
}

public static void main(String args[]){
    int transactions[] = {120, 450, 300, 2500, 700, 150};

    boolean suspicious = hasSuspiciousTransaction(transactions);

    if(suspicious){
        System.out.println("Account Flagged for Review");
    }else{
        System.out.println("No Suspicious Transactions");
    }
}
}