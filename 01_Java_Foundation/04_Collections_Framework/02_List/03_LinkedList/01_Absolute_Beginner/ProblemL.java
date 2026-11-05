/*ProblemL — Stack and Queue Operations Using LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: push(), pop(), element()
1. Theory — Understanding the methods
Java's LinkedList can behave as both a Stack (LIFO) and a Queue (FIFO).
Method	Explanation
push(element)	Inserts an element at the beginning of the LinkedList. Similar to addFirst().
pop()	Removes and returns the first element. Similar to removeFirst().
element()	Retrieves the first element without removing it. Similar to getFirst().

Important: pop() and element() throw NoSuchElementException when called on an empty LinkedList. Unlike peek() and poll(), they do not return null.
2. Problem statement
Write a Java program named ProblemL.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40.
3. Display the original LinkedList.
4. Insert 5 using push().
5. Insert 2 using push().
6. Display the LinkedList after both insertions.
7. Retrieve the first element using element() without removing it.
8. Remove the first element using pop().
9. Remove another first element using pop().
10. Display the final LinkedList and its size.
3. Expected output
Original List: [10, 20, 30, 40]
After Push Operations: [2, 5, 10, 20, 30, 40]
element(): 2
pop(): 2
pop(): 5
Final List: [10, 20, 30, 40]
Total Elements: 4 */

import java.util.LinkedList;

public class ProblemL {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original List: " + numbers);
        numbers.push(5);
        numbers.push(2);
        System.out.println("Updated List:" + numbers );
         System.out.println("Element() :" + numbers.element());
         System.out.println("First Pop: " + numbers.pop());
        System.out.println("Second Pop: " + numbers.pop());
        System.out.println("Final List: " + numbers);
            System.out.println("Total Elements: " + numbers.size());
        
    }
}
