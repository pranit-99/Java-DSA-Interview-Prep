/*ProblemD — Modify Elements in a LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New method: set(index, element)
1. Theory — Understanding set()
The set() method is used to replace an existing element at a specified index in a LinkedList.
- It does not insert a new element.
- It does not change the size of the LinkedList.
- It returns the element that was previously stored at that index.
Syntax:
numbers.set(index, newValue);


For example:
numbers.set(2, 100);


This replaces the element at index 2 with 100.
2. Problem statement
Write a Java program named ProblemD.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 50, 60.
3. Replace the element at index 1 with 25.
4. Replace the element at index 3 with 45.
5. Replace the last element with 100 using set().
6. Display the original and updated LinkedList.
7. Display the total number of elements after modification.
3. Expected output
Original List: [10, 20, 30, 40, 50, 60]
Updated List: [10, 25, 30, 45, 50, 100]
Total Elements: 6 */
import java.util.LinkedList;
public class ProblemD {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List:- " + numbers);

        numbers.set(1, 25);
        numbers.set(3, 45);

        numbers.set(numbers.size() - 1, 100);

        System.out.println("Updated List:- " + numbers);

    }
}
