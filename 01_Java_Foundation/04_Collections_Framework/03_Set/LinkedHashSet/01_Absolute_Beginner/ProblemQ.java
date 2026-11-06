/*ProblemQ — Remove Elements Using removeIf()
Absolute Beginner
 ProblemQ.java
1. Theory: removeIf() Method
The removeIf() method removes all elements from a collection that satisfy a specified condition.
- It was introduced in Java 8 through the Collection interface.
- It accepts a condition written using a lambda expression.
- It returns true if at least one element is removed; otherwise, it returns false.
Syntax:
numbers.removeIf(num -> num > 30);


Here, num -> num > 30 is a lambda expression.
- num represents the current element.
- -> separates the parameter from the condition.
- num > 30 checks whether the element is greater than 30.
If the condition evaluates to true, that element is removed.
2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60, 70, 80.
3. Print the original LinkedHashSet.
4. Remove all elements greater than 40 using removeIf().
5. Print whether any elements were removed.
6. Print the updated LinkedHashSet.
7. Print the number of remaining elements. */
import java.util.LinkedHashSet;
public class ProblemQ {
   public static void main(String args[]){
    LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);

        System.out.println("Original LinkedHashSet: " + numbers);
        boolean isRemoved = numbers.removeIf(num -> num > 40);
        System.out.println("Elements Removed: " + isRemoved);
        System.out.println("Updated LinkedHashSet: " + numbers);
        System.out.println("Remaining Elements: " + numbers.size());
   } 
}
