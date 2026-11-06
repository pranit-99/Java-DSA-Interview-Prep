/*ProblemE — Remove All Elements Using clear()
Absolute Beginner
 ProblemE.java

1. Theory: clear() Method
The clear() method removes all elements from a LinkedHashSet.
- It removes every element, making the LinkedHashSet empty.
- It does not delete the LinkedHashSet object itself.
- It returns void, meaning it does not return any value.
- Time complexity: O(n), where n is the number of elements.
Syntax:
numbers.clear();


2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Print the original LinkedHashSet.
4. Display the number of elements using size().
5. Remove all elements using clear().
6. Print the LinkedHashSet after clearing.
7. Check the size again.
8. Verify whether the LinkedHashSet is empty using isEmpty(). */
import java.util.LinkedHashSet;
public class ProblemE {
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original LinkedHashSet: " + numbers);
        System.out.println("Original Size: " + numbers.size());
        numbers.clear();
        System.out.println("Updated Size: " + numbers.size());
        System.out.println("Is LinkedHashSet Empty: " + numbers.isEmpty());
    }
}
