public class Armstrong {
    public static void main(String args[]){
        int number = 153;
        int originalNumber = number;
        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            int cube = digit * digit* digit;
            sum = sum + cube;
            number = number / 10;
        }
        if(sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
