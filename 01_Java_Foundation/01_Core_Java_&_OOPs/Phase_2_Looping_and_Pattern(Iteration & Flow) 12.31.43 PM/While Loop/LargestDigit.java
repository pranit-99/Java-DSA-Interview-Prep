public class LargestDigit {
    public static void main(String args[]){
        int number = 58329;
        int largest = 0;

        while(number > 0){
            int digit = number % 10;
            if(digit > largest){
                largest = digit;
            }
            number = number / 10;
        }
        System.out.println("Largest digit = " + largest);
    }
}
