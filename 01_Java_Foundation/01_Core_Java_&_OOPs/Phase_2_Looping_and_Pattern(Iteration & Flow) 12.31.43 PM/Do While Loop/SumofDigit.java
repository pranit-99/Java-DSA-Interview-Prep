public class SumofDigit {
    public static void main(String[] args) {
        int number = 5832;
        int sum = 0;

        do { 
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        } while (number > 0);
         System.out.println("Sum of digits = " + sum);
    }
}
