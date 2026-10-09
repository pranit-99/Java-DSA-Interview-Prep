/*Write a Java program that determines whether a number is a multiple of 10.
Input
int number = 75;
Expected Output
Number is not a multiple of 10 */
public class MultipleofTen {
    public static void main(String args[]) {

        int number = 75;

        if(number % 10 == 0) {
            System.out.println("Number is a multiple of 10");
        } else {
            System.out.println("Number is not a multiple of 10");
        }
    }
}
