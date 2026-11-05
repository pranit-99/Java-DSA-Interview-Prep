/*Java Strings — Absolute Beginner
Problem E — String Splitting, Trimming, and Conversion
Absolute Beginner
String · Problem 5 of 5

Objective: Learn how to remove unwanted spaces, split Strings, convert Strings into character arrays, and convert other data types into Strings.
1. Five methods we'll learn
Method	Purpose	Return type
trim()	Removes leading and trailing characters with values up to U+0020, including ordinary spaces	String
strip()	Removes leading and trailing Unicode whitespace	String
split()	Splits a String into an array using a regular expression	String[]
toCharArray()	Converts a String into a character array	char[]
String.valueOf()	Converts a value into its String representation	String

2. Problem statement
Write a Java program that performs five operations using the following input:
String str = "   Java Programming   ";
String languages = "Java,Python,JavaScript";
int number = 100;


Your program should:
1. Remove the extra spaces from the beginning and end using trim().
2. Remove leading and trailing whitespace using strip().
3. Split the programming languages into separate Strings.
4. Convert "Java" into a character array and print each character.
5. Convert the integer 100 into a String.
Expected output:
Trim: Java Programming
Strip: Java Programming
Split:
Java
Python
JavaScript
Character Array:
J
a
v
a
Converted String: 100*/
public class ProblemF {
    public static void main(String args[]){
        String str = "Java Programming";
        String languages = "Java,Python,JavaScript";
        int number = 100;

        System.out.println("Trim: " + str.trim());
        System.out.println("Strip: "+ str.strip());

        String words[] = languages.split(",");
        System.out.println("Split: ");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        char[] characters = "Java".toCharArray();
        System.out.println("Character Array:");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        String converted = String.valueOf(number);
        System.out.println("Converted String: "+ converted);
    }
}
