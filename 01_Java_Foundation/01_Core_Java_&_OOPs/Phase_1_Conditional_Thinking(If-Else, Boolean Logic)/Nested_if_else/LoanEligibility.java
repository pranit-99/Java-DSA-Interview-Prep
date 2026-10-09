/*A person is eligible for a loan only if they pass two checkpoints:

Checkpoint 1: Their monthly salary is at least $4,000.

Checkpoint 2: If the salary requirement is satisfied, their credit score must be at least 700.

Input
int salary = 5500;
int creditScore = 750;
Expected Output
Eligible for loan */
public class LoanEligibility {
    public static void main(String[] args) {
        int salary = 5500;
        int creditScore = 750;

        if(salary >= 4000){
            if(creditScore >= 700){
                System.err.println("Eligible for Loan");
            }else{
                System.err.println(" Not Eligible for Loan");
            }
        }
    }
}
