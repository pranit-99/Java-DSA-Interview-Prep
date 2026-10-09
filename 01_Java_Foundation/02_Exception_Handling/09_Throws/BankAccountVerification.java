public class BankAccountVerification {
    public static void verifyAccount(String accountNumber) throws Exception{
        if(accountNumber == null || accountNumber.length() < 10){
            throw new Exception("Invalid bank account number");
        }
        System.out.println("Account verified successfully.");
    }
    public static void main(String[] args){
        String accountNumber = "12345";
        try {
            verifyAccount(accountNumber);
        } catch (Exception e) {
            System.out.println("Account Verification Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Bank account verification completed.");
    }
}
