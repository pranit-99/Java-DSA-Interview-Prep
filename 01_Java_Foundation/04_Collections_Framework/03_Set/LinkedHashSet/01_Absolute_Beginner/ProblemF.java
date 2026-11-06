/*ProblemF — Iterate Through a LinkedHashSet Using an Enhanced For Loop
Absolute Beginner
 ProblemF.java

1. Theory: Enhanced For Loop (for-each)
An enhanced for loop allows us to access each element of a LinkedHashSet individually without using an index.
- It automatically visits each element in insertion order.
- Unlike ArrayList, LinkedHashSet does not support get(index).
- We can use a for-each loop to print or process every element.
Syntax:
for (Integer num : numbers) {
    System.out.println(num);
}


Here:
- numbers is the LinkedHashSet we are iterating over.
- num is a variable that holds the current element during each iteration.
2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Print the original LinkedHashSet.
4. Use an enhanced for loop to access each element.
5. Print every element on a separate line. */
import java.util.LinkedHashSet;
public class ProblemF {
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original LinkedHashSet: " + numbers);
        System.out.println("LinkedHashSet Elements: ");

        for(Integer num : numbers){
        System.out.println(num);
        }
    }
}
