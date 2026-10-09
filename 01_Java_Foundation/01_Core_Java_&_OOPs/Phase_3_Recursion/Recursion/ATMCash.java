/*An ATM needs to dispense an amount using $100 bills.

Suppose:

int amount = 500;

The ATM should display:

Dispensing $100
Remaining Amount: $400

Dispensing $100
Remaining Amount: $300

Dispensing $100
Remaining Amount: $200

Dispensing $100
Remaining Amount: $100

Dispensing $100
Remaining Amount: $0

Transaction Complete

We'll assume the amount is always a positive multiple of 100.

Create:

public static void dispenseCash(int amount)

No for or while loop. */
public class ATMCash {
    public static void dispenseCash(int amount){
        if (amount == 0){
            System.out.println("Transaction Complete");
            return;
        }

        System.out.println("Dispensing 100");

        amount = amount - 100;

        System.out.println("Remaining Amount: $"+ amount);
        System.err.println();

        dispenseCash(amount);

    }
    public static void main(String args[]){
        dispenseCash(500);
    }
}
