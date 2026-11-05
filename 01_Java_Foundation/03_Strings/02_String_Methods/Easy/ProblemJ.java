/*Problem J — Working with Unicode Characters
Absolute Beginner Series
StringBuilder · Problem 5 of 5

Objective: Learn five additional StringBuilder methods for handling Unicode characters and code points.

These methods are slightly more advanced than our previous problems, so we'll use simple English letters first.
1. Five methods we'll learn
Method	Purpose	Return type
appendCodePoint()	Appends a Unicode character using its code point	StringBuilder
codePointAt()	Returns the Unicode code point at an index	int
codePointBefore()	Returns the code point immediately before an index	int
codePointCount()	Counts Unicode code points in a specified range	int
offsetByCodePoints()	Finds an index after moving a specified number of code points	int

What is a Unicode code point?
Every Unicode character has a numerical identifier called a code point.

For example:
Character	Unicode code point (decimal)
A	65
B	66
C	67
a	97
b	98

Java uses UTF-16 for Strings and StringBuilder. Some Unicode characters occupy two char positions, so a code point is not always the same as a single char.
2. Problem statement
Write a Java program that:
1. Creates a StringBuilder containing "ABC".
2. Appends the character 'D' using its Unicode code point 68.
3. Finds the code point at index 0.
4. Finds the code point immediately before index 2.
5. Counts the code points between indexes 0 and 4.
6. Finds the index reached after moving two code points from */

public class ProblemJ {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ABC");

        System.out.println("Original: " + sb);

        
        sb.appendCodePoint(68);

        System.out.println("After Append Code Point: " + sb);

        System.out.println("Code Point At Index 0: "+ sb.codePointAt(0));

        System.out.println("Code Point Before Index 2: "+ sb.codePointBefore(2));
        
        System.out.println("Total Code Points: "+ sb.codePointCount(0, sb.length()));

        System.out.println("Index After Moving 2 Code Points: "+ sb.offsetByCodePoints(0, 2));
    }
}

