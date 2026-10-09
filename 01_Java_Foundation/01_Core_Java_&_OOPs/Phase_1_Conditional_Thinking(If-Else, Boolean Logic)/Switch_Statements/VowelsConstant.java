public class VowelsConstant {
    public static void main(String args[]) {

        char ch = 'e';

        switch(ch) {

            case 'a', 'e', 'i', 'o', 'u' ->
                System.out.println("Character is a vowel");

            default ->
                System.out.println("Character is a consonant");
        }
    }
}
