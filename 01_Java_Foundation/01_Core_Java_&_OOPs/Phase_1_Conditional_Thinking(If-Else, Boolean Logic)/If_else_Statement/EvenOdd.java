/*Write a Java program that determines whether a given number is even or odd.

Input:

int number = 17;

Expected output:

Number is odd */
public class EvenOdd {
    public static void main (String args[]){
        int number = 17;

        if(number % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
