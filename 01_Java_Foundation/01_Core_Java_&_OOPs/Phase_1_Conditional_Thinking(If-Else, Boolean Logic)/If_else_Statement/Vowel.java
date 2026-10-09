/*Write a Java program that determines whether a character is a vowel or consonant.
Input
char ch = 'e';
Expected Output
Character is a vowel */
public class Vowel {
    public static void main(String args[]) {

        char ch = 'e';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Character is a vowel");
        } else {
            System.out.println("Character is a consonant");
        }
    }
}
