/*Java StringBuilder — Absolute Beginner
Problem I — Searching and Extracting Characters
Absolute Beginner
StringBuilder · Problem 4 of 5

Objective: Learn how to search for text, extract substrings, and copy characters from a StringBuilder using five methods.
1. Five methods we'll learn
Method	Purpose	Return type
indexOf()	Finds the first occurrence of a substring	int
lastIndexOf()	Finds the last occurrence of a substring	int
substring()	Extracts a portion of the character sequence	String
subSequence()	Returns a character sequence from a specified range	CharSequence
getChars()	Copies characters into an existing character array	void

2. Problem statement
Write a Java program using the following StringBuilder:
StringBuilder sb = new StringBuilder("Java Programming Java");


Your program should:
1. Find the first occurrence of "Java".
2. Find the last occurrence of "Java".
3. Extract "Programming" using substring().
4. Extract "Java" using subSequence().
5. Copy the first four characters into a character array using getChars().
Expected output:
First Occurrence: 0
Last Occurrence: 17
Substring: Programming
SubSequence: Java
Copied Characters: Java */
public class ProblemK {
    public static void main(String args[]){
        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuilder sb = new StringBuilder("Java Programming Java");

        System.out.println("First Occurance: " +sb.indexOf("Java"));

        System.out.println("Last Occurance: " +sb.lastIndexOf("Java"));

        String word = sb.substring(5, 16);
        System.out.println("Substring: " + word);

        CharSequence sequence  = sb.subSequence(0, 4);
        System.out.println("SubSequence: " + sequence);

        char[] characters  = new char[4];
        sb.getChars(0, 4, characters, 0);
        System.out.print("Copied Characters: ");
        for(int i = 0; i < characters.length; i++){
            System.out.print(characters[i]);
        }
        System.out.println();

    }
}
