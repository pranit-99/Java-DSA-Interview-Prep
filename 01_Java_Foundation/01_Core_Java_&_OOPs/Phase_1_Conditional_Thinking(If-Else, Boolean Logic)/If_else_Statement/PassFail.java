/*Write a Java program that checks whether a student has passed or failed.

A student passes if their marks are 40 or above.

Input:

int marks = 36;

Expected output:

Student failed */
public class PassFail {
    public static void main (String args[]){
        int number = 36;

        if(number >= 40){
            System.out.println("Student Passed");
        }else{
            System.out.println("Student Failed");
        }
    }
}
