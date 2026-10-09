public class Palindrome {
    public static void main(String args[]){
    int number = 12321;
    int originalNumber = number;
    int reverse = 0;

    while(number > 0){
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        number = number / 10;
    }

    if(originalNumber == reverse){
        System.out.println(originalNumber + " is a palindrome");
    }else{
        System.out.println(originalNumber + " is not a palindrome");
    }
}
}
