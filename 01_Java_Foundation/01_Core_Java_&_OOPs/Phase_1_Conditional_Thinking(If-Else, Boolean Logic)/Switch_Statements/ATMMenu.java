public class ATMMenu {
    public static void main(String args[]) {
        int choice = 2;
        switch(choice) {
            case 1 ->
                System.out.println("Check Balance");
            case 2 ->
                System.out.println("Deposit Money");
            case 3 ->
                System.out.println("Withdraw Money");
            case 4 ->
                System.out.println("Exit");
            default ->
                System.out.println("Invalid Choice");
        }
    }
}
