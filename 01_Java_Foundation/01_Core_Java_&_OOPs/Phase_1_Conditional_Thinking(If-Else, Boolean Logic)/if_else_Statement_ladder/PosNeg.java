/*Write a Java program that determines whether a number is:
Positive
Negative
Zero
Example 1
int number = 25;
Output:
Number is positive
Example 2
int number = -10;
Output:
Number is negative
Example 3
int number = 0;
Output:
Number is zero */
public class PosNeg {
    public static void main(String[] args) {
        int number = 25;

        if(number > 0){
            System.out.println("Number is Positive");
        }else if(number < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
