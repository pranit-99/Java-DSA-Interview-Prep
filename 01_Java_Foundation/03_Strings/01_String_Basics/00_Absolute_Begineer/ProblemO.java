/*ava StringBuffer — Absolute Beginner
Problem N — Searching and Extracting Characters
Absolute Beginner
StringBuffer · Problem 4 of 5

Objective: Learn how to search for words, extract portions of text, and copy characters from a StringBuffer using five methods.
1. Five methods we'll learn
Method	Purpose	Return type
indexOf()	Finds the first occurrence of a substring	int
lastIndexOf()	Finds the last occurrence of a substring	int
substring()	Extracts a portion of the text	String
subSequence()	Extracts characters as a CharSequence	CharSequence
getChars()	Copies characters into an existing character array	void

Important: These five methods do not modify the original StringBuffer. */
public class ProblemO {
public static void main(String[] args) {

        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuffer sb = new StringBuffer("Java Programming Java");

        
        System.out.println("First Occurrence: "+ sb.indexOf("Java"));

        
        System.out.println("Last Occurrence: "+ sb.lastIndexOf("Java"));

    
        String word = sb.substring(5, 16);

        System.out.println("Substring: " + word);

        
        CharSequence sequence = sb.subSequence(0, 4);

        System.out.println("SubSequence: " + sequence);

        
        char[] characters = new char[4];

        sb.getChars(0, 4, characters, 0);

        System.out.print("Copied Characters: ");

        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }

        System.out.println();
    }
}
