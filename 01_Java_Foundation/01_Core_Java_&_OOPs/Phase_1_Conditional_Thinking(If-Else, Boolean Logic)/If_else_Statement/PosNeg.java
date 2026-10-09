/*Write a Java program that determines whether a number is positive or negative.

Input:

int number = -15;

Expected output:

Number is negative */
public class PosNeg {
    public static void main (String args[]){
        int number = -15;

        if(number > 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}
