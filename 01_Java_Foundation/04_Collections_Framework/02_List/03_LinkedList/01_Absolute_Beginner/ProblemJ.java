/*ProblemJ — Remove Elements Using poll(), pollFirst(), and pollLast()
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: poll(), pollFirst(), pollLast()
1. Theory — Understanding poll methods
The poll() methods retrieve and remove elements from a LinkedList. Unlike peek(), which only retrieves an element, poll() removes it from the list.

These methods return null when the LinkedList is empty instead of throwing a NoSuchElementException.
Method	Explanation
poll()	Retrieves and removes the first element.
pollFirst()	Retrieves and removes the first element.
pollLast()	Retrieves and removes the last element.

Important difference:
- peek() → Retrieves without removing.
- poll() → Retrieves and removes.
2. Problem statement
Write a Java program named ProblemJ.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 50, 60.
3. Display the original LinkedList.
4. Remove the first element using poll().
5. Remove the next first element using pollFirst().
6. Remove the last element using pollLast().
7. Display the updated LinkedList and its size.
8. Create another empty LinkedList.
9. Call poll(), pollFirst(), and pollLast() on the empty LinkedList and display their return values.
3. Expected output
Original List: [10, 20, 30, 40, 50, 60]
poll(): 10
pollFirst(): 20
pollLast(): 60
Updated List: [30, 40, 50]
Total Elements: 3

Empty LinkedList: []
poll(): null
pollFirst(): null
pollLast(): null */
import java.util.LinkedList;

public class ProblemJ {
    public static void main(String args[]){
        LinkedList<Integer> numbers  = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List: " + numbers);
        System.out.println("Poll (): " + numbers.poll());
        System.out.println("PollFirst(): " + numbers.pollFirst());
        System.out.println("Pll Last(): "+ numbers.pollLast());
        System.out.println("Updated List: " + numbers);
        System.out.println("Updated List: " + numbers.size());

        LinkedList<Integer> empty  = new LinkedList<>();
        System.out.println("Empty Linked List: " + empty);
        System.out.println("Poll (): " + empty.poll());
        System.out.println("PollFirst(): " + empty.pollFirst());
        System.out.println("Pll Last(): "+ empty.pollLast());
        System.out.println("Updated List: " + empty);
        System.out.println("Updated List: " + empty.size());


    }
}
