/*Rules

If the transaction type is "Withdraw":

If amount <= balance → "Withdrawal successful"
Otherwise → "Insufficient balance"

If the transaction type is "Deposit":

If amount <= 10000 → "Deposit accepted"
Otherwise → "Deposit requires verification"
Input
String transactionType = "Deposit";
int amount = 15000;
int balance = 8000;*/
public class BankTransaction {

    public static void main(String args[]) {

        String transactionType = "Deposit";
        int amount = 15000;
        int balance = 8000;

        if(transactionType.equals("Withdraw")) {

            if(amount <= balance) {
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance");
            }

        } else {

            if(amount <= 10000) {
                System.out.println("Deposit accepted");
            } else {
                System.out.println("Deposit requires verification");
            }
        }
    }
}
