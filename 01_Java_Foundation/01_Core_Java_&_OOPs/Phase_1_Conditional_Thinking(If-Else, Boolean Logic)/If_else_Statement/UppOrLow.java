/*Write a Java program that checks whether a given character is uppercase or lowercase.

Input:

char ch = 'G';

Expected output:

Character is uppercase */
public class UppOrLow {
    public static void main(String args[]) {

        char ch = 'G';

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Character is uppercase");
        } else {
            System.out.println("Character is lowercase");
        }
    }
}
