/*Bank Interest Rate System

Now we are switching from Method Overloading → Method Overriding.

For these first few problems, pay close attention to this structure:

Parent Class
     ↓
Child Class
     ↓
Same Method
     ↓
@Override
     ↓
Different Implementation
Problem Statement

Suppose we have a general Bank class.

Every bank can display an interest rate, so the parent class provides:

displayInterestRate()

But different banks have different interest rates.

We'll create:

Bank
 ├── ChaseBank
 └── BankOfAmerica

Both child classes will override the parent's displayInterestRate() method. */
class Bank{
    public void displayInterestRate(){
        System.out.println("General Bank Interest Rate");
    }
}

class ChaseBank extends Bank{
    @Override
    public void displayInterestRate(){
        System.out.println("Chase Bank Interest Rate: 4.5%");
    }

}

class BankOfAmerica extends Bank{
    @Override
    public void displayInterestRate(){
        System.out.println("Bank of America Interest Rate: 4.2%");
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new ChaseBank();
        Bank bank2 = new BankOfAmerica();

        bank1.displayInterestRate();
        bank2.displayInterestRate();
    }
}
