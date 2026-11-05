/*Problem 4 — Check Balanced Parentheses Using ArrayDeque
For our fourth problem, we'll use the modern Java Stack approach:
Deque<Character> stack = new ArrayDeque<>();

This problem also introduces one of the most important Stack patterns.
Problem Statement
Given:
"{[()]}"

Check whether the brackets are balanced.
Balanced:
()
{}
[]
{[()]}

Not balanced:
(]
{[(]}
((() */
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {

    public static boolean isBalanced(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // Nothing available to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
