public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;

        do { 
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        } while (number > 0);
        System.out.println("Reversed number = " + reverse);
    }
}
