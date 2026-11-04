/*Problem D — String Extraction and Modification
Absolute Beginner
String · Problem 4 of 5

Objective: Learn how to extract, replace, and combine text using five String methods.
1. Five methods we'll learn
Method	Purpose	Return type
substring()	Extracts a portion of a String	String
replace()	Replaces all matching characters or literal substrings	String
replaceAll()	Replaces matches using a regular expression	String
replaceFirst()	Replaces the first regex match	String
concat()	Joins another String to the end	String

Important: Strings are immutable in Java. These methods return new Strings rather than modifying the original.
2. Problem statement
Write a Java program that performs the following operations.

Input:
String str = "Java is easy. Java is powerful.";


Your program should:
1. Extract the word "Java" using substring().
2. Replace every occurrence of "Java" with "Python" using replace().
3. Replace all digits in a separate String with * using replaceAll().
4. Replace only the first occurrence of "Java" with "Python" using replaceFirst().
5. Add " Keep Learning!" to the original String using concat().
Expected output:
Substring: Java
Replace: Python is easy. Python is powerful.
Replace All: Order ID: ***
Replace First: Python is easy. Java is powerful.
Concat: Java is easy. Java is powerful. Keep Learning! */
public class ProblemE {
    public static void main(String args[]){
        String str = "Java is easy. Java is powerful.";
        String order = "Order Id: 123";

        //Method 1: substring()
        System.out.println("Substring: "+ str.substring(0, 4));
        System.out.println("Replace: "+ str.replace("Java", "Python"));
        System.out.println("Replace All: " + order.replaceAll("\\d", "*"));
        System.out.println("Replace First: "+ str.replaceFirst("Java", "Python"));
        System.out.println("Concat: " + str.concat("Keep Learning"));
    }
}
