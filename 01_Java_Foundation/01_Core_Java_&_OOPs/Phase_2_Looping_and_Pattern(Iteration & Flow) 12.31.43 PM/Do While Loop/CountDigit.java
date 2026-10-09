public class CountDigit {
    public static void main(String[] args) {
        int number = 58327;
        int count = 0;

        do { 
            number = number / 10;
            count++;
        } while (number > 0);
        System.out.println("Number of Digits=" + count);
    }
}
