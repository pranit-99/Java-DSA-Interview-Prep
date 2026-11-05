/*ProblemH — Traverse a LinkedList in Reverse Order
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New method: descendingIterator()
1. Theory — Understanding descendingIterator()
The descendingIterator() method allows us to traverse a LinkedList from the last element to the first element.
- It returns an Iterator that visits elements in reverse order.
- We use hasNext() to check whether another element is available and next() to retrieve it.
- It does not modify or reverse the original LinkedList.
Syntax:
Iterator<Integer> itr = numbers.descendingIterator();


2. Problem statement
Write a Java program named ProblemH.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 50, 60.
3. Display the original LinkedList.
4. Traverse the LinkedList in reverse order using descendingIterator().
5. Print each element during reverse traversal.
6. Display the original LinkedList again to verify that its order remains unchanged.
3. Expected output
Original List: [10, 20, 30, 40, 50, 60]
Reverse Traversal: 60 50 40 30 20 10
Original List After Traversal: [10, 20, 30, 40, 50, 60] */
import java.util.Iterator;
import java.util.LinkedList;
public class ProblemH {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List: " + numbers);

        //Create reverse iterator
        Iterator<Integer> itr = numbers.descendingIterator();

        System.out.print("Reverse Traversal: ");

        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }

        System.out.println();
        System.out.println("Original List After Traversal: " + numbers);
    }
}
