/*ProblemB — Check Whether an Element Exists Using contains()
Absolute Beginner
 ProblemB.java

1. Theory: contains() Method
The contains() method checks whether a particular element exists inside a LinkedHashSet.
- Returns true if the element exists.
- Returns false if the element does not exist.
- Average time complexity: O(1).
Syntax:
numbers.contains(element);


2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Print the original LinkedHashSet.
4. Check whether 30 exists.
5. Check whether 70 exists.
6. Print the results of both checks. */
import java.util.LinkedHashSet;
public class ProblemB {
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original LinkedHashSet: "+ numbers);
        System.out.println("Contains 30: " + numbers.contains(30));
        System.out.println("Contains 30: " + numbers.contains(70));
    }
}
