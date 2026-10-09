/*An ATM records customer withdrawals during a day:

int[] withdrawals = {200, 500, 100, 1000, 300, 1500, 50, 800};

The bank wants to classify every transaction:

Less than $100       → Small Withdrawal
$100 to $500         → Normal Withdrawal
More than $500       → Large Withdrawal

Create:

public static void analyzeWithdrawals(int[] withdrawals)

For every transaction, print something like:

Transaction 1: $200 - Normal Withdrawal
Transaction 2: $500 - Normal Withdrawal
Transaction 3: $100 - Normal Withdrawal
Transaction 4: $1000 - Large Withdrawal
...

At the end, print:

Small Withdrawals: ?
Normal Withdrawals: ?
Large Withdrawals: ?*/
public class ATMAnalyzer {
    public static void analyzedWithdrawals(int withdrawals[]){
        int small =0;
        int Normal = 0;
        int large  = 0;
        for(int i = 0; i < withdrawals.length; i++){
            if(withdrawals[i] < 100){
                System.out.println("Transaction " + (i + 1) + " :" + withdrawals[i] + " - Small Withdrawl");
                small = small + 1;
            }else if(withdrawals[i] >= 100 && withdrawals[i] <= 500){
               System.out.println("Transaction " + (i + 1) + " :" + withdrawals[i] + " - Normal Withdrawl");
               Normal = Normal + 1; 
            }else{
                System.out.println("Transaction " + (i + 1) + " :" + withdrawals[i] + " - Large Withdrawl");
                if(withdrawals[i] >= 1000){
                    System.err.println("! Transaction requires review");
                }
                large = large + 1;
            }
        }
        System.out.println("Small Withdrawala:-" +small);
        System.out.println("Normal Withdrawala:-" +Normal);
        System.out.println("Large Withdrawala:-" +large);
    }
    public static void main(String[] args) {
        int withdrawals[] = {200, 500, 100, 1000, 300, 1500, 50, 800};
        analyzedWithdrawals(withdrawals);
    }
}
