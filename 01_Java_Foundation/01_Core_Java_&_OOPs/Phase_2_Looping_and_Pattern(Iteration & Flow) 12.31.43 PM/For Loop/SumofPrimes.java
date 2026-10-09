public class SumofPrimes {
    public static void main(String[] args) {

        int n = 20;
        int sum = 0;

        for(int number = 2; number <= n; number++) {

            boolean isPrime = true;

            for(int i = 2; i * i <= number; i++) {

                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                sum = sum + number;
            }
        }

        System.out.println("Sum of Prime Numbers = " + sum);
    }
}
