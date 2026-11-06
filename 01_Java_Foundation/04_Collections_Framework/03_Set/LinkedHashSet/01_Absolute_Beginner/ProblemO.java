/*ProblemO — Convert a LinkedHashSet into an Array Using toArray()
Absolute Beginner
 ProblemO.java
1. Theory: toArray() Method
The toArray() method converts the elements of a LinkedHashSet into an array.
- It preserves the insertion order of the LinkedHashSet.
- It allows us to access elements using array indexes such as arr[0] and arr[1].
- We can use toArray(new Integer[0]) to create an Integer[] array.
Syntax:
Integer[] arr = numbers.toArray(new Integer[0]);


Why new Integer[0]?

It tells Java that we want an array of type Integer[]. Java creates an array large enough to hold all elements.
2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 40, 10, 60, 20, 50, 30.
3. Print the original LinkedHashSet.
4. Convert the LinkedHashSet into an Integer[] array using toArray().
5. Print every array element using a traditional for loop.
6. Print the first and last array elements.
7. Print the total length of the array. */
import java.util.LinkedHashSet;

public class ProblemO {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(60);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);

        System.out.println("Original LinkedHashSet: " + numbers);

        Integer[] arr = numbers.toArray(new Integer[0]);
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
        System.out.println("Array Length: " + arr.length);
    }
}
