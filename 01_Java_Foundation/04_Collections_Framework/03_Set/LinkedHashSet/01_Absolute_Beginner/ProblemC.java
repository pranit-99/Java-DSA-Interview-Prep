/*ProblemC — Remove Elements Using remove()
Absolute Beginner
 ProblemC.java

1. Theory: remove() Method
The remove() method removes a specified element from a LinkedHashSet.
- Returns true if the element exists and is successfully removed.
- Returns false if the element does not exist.
- Average time complexity: O(1).
Syntax:
numbers.remove(element);


2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add 10, 20, 30, 40, 50, 60.
3. Print the original LinkedHashSet.
4. Remove 20 and 40.
5. Attempt to remove 70, which does not exist.
6. Print the results of the removal operations.
7. Print the updated LinkedHashSet. */
import java.util.LinkedHashSet;

public class ProblemC {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original LinkedHashSet: " + numbers);

        System.out.println("Remove 20: " + numbers.remove(20));
        System.out.println("Remove 40: " + numbers.remove(40));
        System.out.println("Remove 70: " + numbers.remove(70));
        System.out.println("Updated LinkedHashSet: " + numbers);
    }
}
