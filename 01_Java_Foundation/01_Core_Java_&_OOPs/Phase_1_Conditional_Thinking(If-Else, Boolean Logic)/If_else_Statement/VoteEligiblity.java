/*Write a Java program that checks whether a person is eligible to vote.

Input:

int age = 16;

Expected output:

Not eligible to vote

If the age is 18 or above:

Eligible to vote */
public class VoteEligiblity {
    public static void main (String args[]){
        int number = 16;

        if(number >= 18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }
    }
}
