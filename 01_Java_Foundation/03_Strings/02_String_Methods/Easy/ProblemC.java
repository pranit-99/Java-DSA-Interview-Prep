/*Problem B — Comparing Two Strings
Absolute Beginner
String · Problem 2 of 5

Objective: Understand how Java compares two Strings using five different methods.
1. Five methods we'll learn
Method	Purpose	Return type
equals()	Checks whether two Strings have identical content	boolean
equalsIgnoreCase()	Compares content while ignoring case	boolean
compareTo()	Compares Strings lexicographically	int
compareToIgnoreCase()	Lexicographical comparison ignoring case	int
contentEquals()	Compares a String with another character sequence	boolean

Important concept: equals() vs compareTo()
equals() returns true or false, whereas compareTo() returns an integer.
compareTo() result	Meaning
Negative	First String comes before the second
Zero	Both Strings are lexicographically equal
Positive	First String comes after the second

2. Problem statement
Write a Java program that compares the following Strings using all five methods.

Input:
String first = "Apple";
String second = "apple";
String third = "Banana";


Your program should:
1. Check whether first and second are equal.
2. Compare them while ignoring case.
3. Compare first with third alphabetically.
4. Compare first with second alphabetically while ignoring case.
5. Compare first with a StringBuilder containing "Apple".
Expected output:
Equals: false
Equals Ignore Case: true
Compare To: -1
Compare To Ignore Case: 0
Content Equals: true */
public class ProblemC {
    public static void main(String args[]){
        String first = "Apple";
        String second = "apple";
        String third = "Banana";

        System.out.println("Equals: "+ first.equals(second));
        System.out.println("Equals Ignore Case: " + first.equalsIgnoreCase(second));
        System.out.println("Compare To: " + first.compareTo(third));
        System.out.println("Compare To Ignore Case: " + first.compareToIgnoreCase(second));
        StringBuilder builder = new StringBuilder("Apple");

        System.out.println("Content Equals: " +
                first.contentEquals(builder));

    }
}
