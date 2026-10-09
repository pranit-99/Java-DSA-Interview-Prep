/*ATM Withdrawal Check

A person can withdraw money only when:

Their account balance is at least $100
The requested withdrawal amount is less than or equal to their balance
Input
int balance = 500;
int withdrawal = 200;
Expected Output
Withdrawal allowed */
public class AtmChequeWithdrawl {
    public static void main(String args[]){
        int balance = 500;
        int withdrawl = 200;

        if(balance  >= 100){
            if(withdrawl <= balance){
                System.out.println("Withdrawl allowed");
            }else{
                System.out.println("Withdrawl Restricted");
            }
        }
    }
}
