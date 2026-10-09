/*Write a Java program that checks whether a given number is divisible by 5.

Input:

int number = 23;

Expected output:

Number is not divisible by 5 */
public class DivisibleBY {
    public static void main (String args[]){
        int number = 23;

        if(number % 5 == 0){
            System.out.println("Number is Divisible by 5");
        }else{
            System.out.println("Number is Not Divisible by 5");
        }
    }
}
