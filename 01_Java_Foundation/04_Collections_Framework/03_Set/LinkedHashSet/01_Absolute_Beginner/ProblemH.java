/*ProblemH — Calculate the Sum of All Elements in a LinkedHashSet
Absolute Beginner
 ProblemH.java

1. Theory: Enhanced For Loop and Accumulator
In this problem, we will combine two concepts:
- Enhanced For Loop: Used to access every element in a LinkedHashSet without using an index.
- Accumulator Variable: A variable that stores a running total as we process each element.
- sum += num: Adds the current element to the existing sum. It is equivalent to sum = sum + num.
2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Print the original LinkedHashSet.
4. Calculate the sum of all elements using an enhanced for loop.
5. Print the final sum. */
import java.util.LinkedHashSet;
public class ProblemH {
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Oringinal LinkedHashSet: " +numbers);
        int sum = 0;
        for(Integer num: numbers){
            sum = sum + num;
        }
        System.out.println("Sum of All Elements: " + sum);
    }
}
