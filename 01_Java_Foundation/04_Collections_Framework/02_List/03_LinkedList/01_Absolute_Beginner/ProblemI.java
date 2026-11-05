/*ProblemI — Retrieve Elements Using peek(), peekFirst(), and peekLast()
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: peek(), peekFirst(), peekLast()
1. Theory — Understanding peek methods
The peek() methods allow us to retrieve elements from a LinkedList without removing them.

Unlike getFirst() and getLast(), these methods return null when the LinkedList is empty instead of throwing a NoSuchElementException.
Method	Explanation
peek()	Retrieves the first element without removing it.
peekFirst()	Retrieves the first element without removing it.
peekLast()	Retrieves the last element without removing it.

Important: All three methods leave the LinkedList unchanged.
2. Problem statement
Write a Java program named ProblemI.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 50, 60.
3. Display the original LinkedList.
4. Retrieve the first element using peek().
5. Retrieve the first element using peekFirst().
6. Retrieve the last element using peekLast().
7. Display the LinkedList after all operations.
8. Create another empty LinkedList and call all three methods to observe their return values.
3. Expected output
Original List: [10, 20, 30, 40, 50, 60]
peek(): 10
peekFirst(): 10
peekLast(): 60
List After Peek Operations: [10, 20, 30, 40, 50, 60]

Empty LinkedList:
peek(): null
peekFirst(): null
peekLast(): null */
import java.util.LinkedList;
public class ProblemI {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
         numbers.add(20);
          numbers.add(30);
           numbers.add(40);
            numbers.add(50);
             numbers.add(60);

             System.out.println("Original List: " + numbers);
             System.out.println("Peek(): " + numbers.peek());
             System.out.println("PeekFirst(): " + numbers.peekFirst());
             System.out.println("PeekLast(): " + numbers.peekLast());
             System.out.println("List After Peek Operations: " + numbers);

             LinkedList<Integer> emptyList = new LinkedList<>();

             System.out.println("Empty LinkedList: " + emptyList);
             System.out.println("Peek(): " + emptyList.peek());
             System.out.println("PeekFirst(): " + emptyList.peekFirst());
             System.out.println("PeekLast(): " + emptyList.peekLast());
             System.out.println("List After Peek Operations: " + emptyList);

    }
}
