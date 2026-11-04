/*Problem C — Searching Within a String
Absolute Beginner
String · Problem 3 of 5

Objective: Learn how to search for characters, words, and patterns inside a String using five methods.
1. Five methods we'll learn
Method	Purpose	Return type
contains()	Checks whether a sequence of characters exists	boolean
indexOf()	Finds the first occurrence of a character or substring	int
lastIndexOf()	Finds the last occurrence of a character or substring	int
startsWith()	Checks whether a String begins with specified text	boolean
endsWith()	Checks whether a String ends with specified text	boolean

Important: indexOf() and lastIndexOf() return -1 when the requested character or substring is not found.
2. Problem statement
Write a Java program that searches within a String using all five methods.

Input:
String str = "Java Programming Java";


Your program should:
1. Check whether the String contains "Programming".
2. Find the first occurrence of "Java".
3. Find the last occurrence of "Java".
4. Check whether the String starts with "Java".
5. Check whether the String ends with "Java".
Expected output:
Contains Programming: true
First Occurrence of Java: 0
Last Occurrence of Java: 17
Starts With Java: true
Ends With Java: true */
public class ProblemD {
    public static void main(String args[]){
        String str = "Java Programming Java";

        System.out.println("Contains Programming: " + str.contains("Programming"));
        System.out.println("First Occurance of Java: " + str.indexOf("Java"));
        System.out.println("Last Occurance of Java: " + str.lastIndexOf("Java"));
        System.out.println("Starts with Java: "+ str.startsWith("Java"));
        System.out.println("Ends With Java: " + str.endsWith("Java"));
        
    }
}
