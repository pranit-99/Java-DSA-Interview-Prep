/*Final Problem: ATM Card

Create a class:

ATMCard

with these private fields:

private int cardId;
private String cardHolderName;
private double balance;
private boolean cardActive;
Requirements
cardId
Must be greater than 0.
Can only be assigned once.
Provide a getter.
cardHolderName
Cannot be null or empty.
Provide setter and getter.
balance
Provide only a getter.
Do NOT create setBalance().
cardActive
Provide:
public boolean isCardActive()
Do NOT create setCardActive().
Create:
activateCard()

If the card is already active:

Card is already active

Otherwise change:

cardActive = true;
Create:
deactivateCard()

If the card is already inactive:

Card is already inactive

Otherwise:

cardActive = false;
Create:
deposit(double amount)

It should first check whether the card is active.

If the card is inactive:

Card is inactive

If amount <= 0:

Invalid deposit amount

Otherwise:

balance = balance + amount;
Create:
withdraw(double amount)

There are three validations:

Card must be active

amount must be greater than 0

amount cannot be greater than balance

Print appropriate messages:

Card is inactive
Invalid withdrawal amount
Insufficient balance

Otherwise:

balance = balance - amount;

and print:

Withdrawal successful
Test It

Your main() should test approximately this flow: */
public class ATMCard {

    private int cardId;
    private String cardHolderName;
    private double balance;
    private boolean cardActive;

    public void setCardId(int cardId) {

        if(this.cardId == 0 && cardId > 0) {
            this.cardId = cardId;
        } else {
            System.out.println(
                "Invalid Card ID or Card ID already assigned"
            );
        }
    }


    public int getCardId() {
        return cardId;
    }

    public void setCardHolderName(String cardHolderName) {
        if(cardHolderName != null && !cardHolderName.isEmpty()) {
            this.cardHolderName = cardHolderName;
        } else {
            System.out.println("Invalid card holder name");
        }
    }


    public String getCardHolderName() {
        return cardHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isCardActive() {
        return cardActive;
    }

    public void activateCard() {
        if(this.cardActive) {
            System.out.println("Card is already active");
        } else {
            this.cardActive = true;
            System.out.println("Card activated successfully");
        }
    }

    public void deactivateCard() {
        if(!this.cardActive) {
            System.out.println("Card is already inactive");
        } else {
            this.cardActive = false;
            System.out.println("Card deactivated successfully");
        }
    }


    public void deposit(double amount) {
        if(!this.cardActive) {
            System.out.println("Card is inactive");
        } else if(amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            this.balance = this.balance + amount;
            System.out.println("Deposit successful");
        }
    }

    public void withdraw(double amount) {
        if(!this.cardActive) {
            System.out.println("Card is inactive");
        } else if(amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if(amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Withdrawal successful");
        }
    }

    public static void main(String[] args) {
        ATMCard card = new ATMCard();

        card.setCardId(1001);
        card.setCardHolderName("Pranit");

        card.activateCard();

        card.deposit(1000);

        card.withdraw(300);

        System.out.println();
        System.out.println("ATM Card Details");

        System.out.println(
            "Card ID: " + card.getCardId()
        );

        System.out.println(
            "Card Holder: " + card.getCardHolderName()
        );

        System.out.println(
            "Balance: " + card.getBalance()
        );

        System.out.println(
            "Card Active: " + card.isCardActive()
        );


        card.deactivateCard();


        // Should fail because card is inactive
        card.withdraw(100);
    }
}