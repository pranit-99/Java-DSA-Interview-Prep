/*Given an integer, first determine whether it is positive or negative.

Then:

If it is positive, determine whether it is even or odd.
If it is negative, determine whether its absolute value is greater than 100 or not.

Assume the number is never 0.

Example 1
int number = 24;

Expected:

Number is positive
Positive number is even*/
public class NumberClassification {
    public static void main(String args[]){
        int number = 15;

        if(number > 0){
            System.out.println("Number is Positive");
            if(number % 2 == 0){
                System.out.println("Positive Number is Even");
            }else{
                System.out.println("Positive Number is Odd");
            }
        }else{
            System.out.println("Number is negative");
            int result = Math.abs(number);
            if(result > 100){
                System.out.println("Absolute value is Greater than 100");
            }else{
                System.err.println("Absolute value  not Greater than 100");
            }
        }
    }
}
