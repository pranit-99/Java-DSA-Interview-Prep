/*ProblemI — Find the Maximum and Minimum Elements in a LinkedHashSet
Absolute Beginner
 ProblemI.java

1. Theory: Maximum and Minimum Elements
In this problem, we will use an enhanced for loop to find the largest and smallest elements in a LinkedHashSet.
- Maximum: The largest element in the collection.
- Minimum: The smallest element in the collection.
- Comparison: We use > and < to compare each element with the current maximum and minimum.
We will also introduce two useful Java constants:
Constant	Meaning
Integer.MIN_VALUE	Smallest possible int value: -2,147,483,648
Integer.MAX_VALUE	Largest possible int value: 2,147,483,647

2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 40, 10, 60, 20, 50, 30.
3. Print the original LinkedHashSet.
4. Find the maximum element using an enhanced for loop.
5. Find the minimum element using the same loop.
6. Print both results. */
import java.util.LinkedHashSet;
public class ProblemI {
    public static void main(String args[]){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(60);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);

        System.out.println("Original LinkedHashSet: " + numbers);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer num : numbers){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
