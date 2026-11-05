/*ProblemK — Insert Elements Using offer(), offerFirst(), and offerLast()
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: offer(), offerFirst(), offerLast()
1. Theory — Understanding offer methods
The offer() methods are used to insert elements into a LinkedList. They are commonly used when a LinkedList behaves as a Queue or Deque.

Unlike add(), these methods return a boolean indicating whether the insertion was successful.
Method	Explanation
offer(element)	Inserts an element at the end of the LinkedList.
offerFirst(element)	Inserts an element at the beginning of the LinkedList.
offerLast(element)	Inserts an element at the end of the LinkedList.

Important: For Java's standard LinkedList, these methods return true when insertion succeeds. They do not enforce a fixed capacity.
2. Problem statement
Write a Java program named ProblemK.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40.
3. Display the original LinkedList.
4. Insert 50 using offer().
5. Insert 5 using offerFirst().
6. Insert 60 using offerLast().
7. Display the boolean result of each insertion.
8. Display the updated LinkedList.
9. Display the total number of elements. */
import java.util.LinkedList;

public class ProblemK {
    public static void main(String args[]){

    
    LinkedList<Integer> numbers = new LinkedList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);

    System.out.println("Original List: "+numbers);
    System.out.println("Offer(50): "+ numbers.offer(50));
    System.out.println("OfferFirst(5): "+ numbers.offerFirst(5));
    System.out.println("OfferLast(60): "+ numbers.offerLast(60));
    System.out.println("Updated List: "+ numbers);
    System.out.println("Total Elements: "+ numbers.size());

}
}
