/*ProblemE — Remove Elements from a LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: remove(), removeFirst(), removeLast()
1. Theory — Understanding removal methods
The LinkedList class provides several methods to remove elements from different positions. Unlike set(), removing an element decreases the size of the LinkedList.
Method	Explanation
removeFirst()	Removes and returns the first element.
removeLast()	Removes and returns the last element.
remove(index)	Removes and returns the element at the specified index.
remove(Object)	Removes the first occurrence of the specified value.

Important: With LinkedList<Integer>, remove(2) removes the element at index 2, whereas remove(Integer.valueOf(20)) removes the first occurrence of the value 20.
2. Problem statement
Write a Java program named ProblemE.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 50, 60, 70, 80.
3. Display the original LinkedList.
4. Remove the first element using removeFirst().
5. Remove the last element using removeLast().
6. Remove the element at index 2 using remove(index).
7. Remove the element with value 60 using remove(Object).
8. Display the final LinkedList.
9. Display the total number of remaining elements.
3. Expected output
Original List: [10, 20, 30, 40, 50, 60, 70, 80]
Final List: [20, 30, 50, 70]
Total Elements: 4 */
import java.util.LinkedList;
public class ProblemE {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);

        System.out.println("Original List: " + numbers);

        numbers.removeFirst();
        numbers.removeLast();
        numbers.remove(2);
        numbers.remove(Integer.valueOf(60));

        System.out.println("Updated List: " + numbers);
        System.out.println("Total Elements: " + numbers.size());
    }
}
