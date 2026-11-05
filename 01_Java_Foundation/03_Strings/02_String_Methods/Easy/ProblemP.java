/*Java StringBuffer — Absolute Beginner
Problem O — Working with Unicode Characters
Absolute Beginner Series
StringBuffer · Problem 5 of 5

Objective: Learn five methods for working with Unicode characters and code points in StringBuffer.

This is our final problem in the Absolute Beginner series for String, StringBuilder, and StringBuffer.
1. Five methods we'll learn
Method	Purpose	Return type
appendCodePoint()	Appends a character using its Unicode code point	StringBuffer
codePointAt()	Returns the Unicode code point at an index	int
codePointBefore()	Returns the code point before an index	int
codePointCount()	Counts Unicode code points in a specified range	int
offsetByCodePoints()	Finds an index after moving a specified number of code points	int */

public class ProblemP {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("ABC");

        System.out.println("Original: " + sb);

        
        sb.appendCodePoint(68);

        System.out.println("After Append Code Point: " + sb);

        
        System.out.println("Code Point At Index 0: "
                + sb.codePointAt(0));

      
        System.out.println("Code Point Before Index 2: "
                + sb.codePointBefore(2));

       
        System.out.println("Total Code Points: "
                + sb.codePointCount(0, sb.length()));

        
        System.out.println(
                "Index After Moving 2 Code Points: "
                + sb.offsetByCodePoints(0, 2));
    }
}

