/*ProblemA — Create a LinkedHashSet and Add Elements
Absolute Beginner
 Problem A / Java

1. Theory: LinkedHashSet and add()
LinkedHashSet stores unique elements and maintains their insertion order.

The add() method inserts an element into the LinkedHashSet.
- add(element) returns true if the element is newly added.
- It returns false if the element already exists.
- Duplicate elements are not stored.
2. Problem Statement
Write a Java program that creates a LinkedHashSet<Integer> and performs the following operations:
1. Create an empty LinkedHashSet named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Attempt to add 20 and 40 again.
4. Print the entire LinkedHashSet.
5. Observe whether duplicate elements are stored and whether insertion order is maintained.
3. Expected Output
LinkedHashSet Elements: [10, 20, 30, 40, 50, 60]*/
import java.util.LinkedHashSet;
 
public class ProblemA{
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(20);
        numbers.add(40);

        System.out.println("LinkedHashSet Elements: " + numbers);
    }
}