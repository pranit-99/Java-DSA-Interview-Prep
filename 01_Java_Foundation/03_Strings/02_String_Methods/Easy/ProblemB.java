/*Problem A — Basic String Operations
Absolute Beginner
String · Problem 1 of 5

Objective: Learn five fundamental String methods by solving one Java problem.
1. Five methods we'll learn
Method	        Purpose	Example                         result
length()	    Returns total characters	                5
charAt()	    Returns character at an index	           'H'
toUpperCase()	Converts text to uppercase	                "HELLO"
toLowerCase()	Converts text to lowercase	                "hello"
isEmpty()	    Checks whether String has zero characters	false

2. Problem statement
Write a Java program that accepts a predefined String and performs the following operations:
1. Print the original String.
2. Find the total number of characters.
3. Print the first and last characters.
4. Convert the String to uppercase and lowercase.
5. Check whether the String is empty.
Input:
String str = "Hello Java";


Expected output:
Original String: Hello Java
Length: 10
First Character: H
Last Character: a
Uppercase: HELLO JAVA
Lowercase: hello java
Is Empty: false */
public class ProblemB {
    public static void main(String args[]){
        String str = "Hello Java";

        System.out.println("Oringial String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("First Character: " + str.charAt(0));
        System.out.println("Last Character: " + str.charAt(str.length() - 1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Is Empty: " + str.isEmpty());

    }
}
