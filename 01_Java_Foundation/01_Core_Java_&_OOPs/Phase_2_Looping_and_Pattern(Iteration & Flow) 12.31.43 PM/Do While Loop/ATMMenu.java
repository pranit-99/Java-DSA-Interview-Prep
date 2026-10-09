import java.util.Scanner;

public class ATMMenu {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1000;
        int choice;

        do {

            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> System.out.println("Balance: $" + balance);

                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Deposit successful.");
                }

                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    if(withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                }

                case 4 -> System.out.println("Thank you for using the ATM.");

                default -> System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        scanner.close();
    }
}
