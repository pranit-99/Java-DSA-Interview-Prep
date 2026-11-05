/*ProblemA — Create a LinkedList and Add Elements
Absolute Beginner
Concepts: LinkedList, add(), size(), isEmpty()
1. Problem statement
Write a Java program that performs the following operations:
1. Create a LinkedList of integers.
2. Add five elements: 10, 20, 30, 40, 50.
3. Display the entire LinkedList.
4. Find the total number of elements.
5. Check whether the LinkedList is empty.
2. Theory — Understanding the operations
Method / Concept	Explanation
LinkedList<Integer>	Creates a LinkedList that stores Integer objects.
add(element)	    Appends an element to the end of the list.
size()	            Returns the number of elements currently stored.
isEmpty()	        Returns true if the list contains no elements; otherwise false.

Important: Java's LinkedList uses a doubly linked structure internally. Unlike ArrayList, it does not store its elements in a single backing array. */
import java.util.LinkedList;

public class ProblemA {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("LinkedList: " + numbers);
        System.out.println("Total Elements: " + numbers.size());
        System.out.println("Is Empty: " + numbers.isEmpty());
    }
}
