/*Problem 3 — Reverse a String Using Java Stack
Now we've implemented Stack manually using Array and Linked List. Let's use Java's built-in Stack class in an actual problem.
Problem Statement
Given a string:
"JAVA"

Reverse the string using a Stack.*/
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String str = "JAVA";

        Stack<Character> stack = new Stack<>();

        // Push every character into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
