/*ProblemD — Count Elements Using size() and Check Empty Status Using isEmpty()
Absolute Beginner
 ProblemD.java

1. Theory: size() and isEmpty() Methods
size() Method

The size() method returns the total number of unique elements currently stored in a LinkedHashSet.
- Returns an integer value.
- Duplicate elements are not counted.
- Time complexity: O(1).
Syntax:
numbers.size();


isEmpty() Method

The isEmpty() method checks whether the LinkedHashSet contains any elements.
- Returns true when the LinkedHashSet has zero elements.
- Returns false when at least one element exists.
- Time complexity: O(1).
Syntax:
numbers.isEmpty();


2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Check whether the LinkedHashSet is initially empty.
3. Add 10, 20, 30, 40, 50, 60.
4. Attempt to add duplicate elements 20 and 40.
5. Print the LinkedHashSet.
6. Display the total number of elements using size().
7. Check whether the LinkedHashSet is empty after inserting elements. */
import java.util.LinkedHashSet;
public class ProblemD {
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        System.out.println("Initially Empty: " + numbers.isEmpty());

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.add(20);
        numbers.add(40);

        System.out.println("LinkedHashSet Elements: " + numbers);
        System.out.println("Total Elements: " + numbers.size());
        System.out.println("Is LinkedHashSet Empty: " + numbers.isEmpty());
    }
}
