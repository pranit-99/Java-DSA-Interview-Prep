/*ProblemF — Search for Elements in a LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: contains(), indexOf(), lastIndexOf()
1. Theory — Understanding search methods
Java's LinkedList provides methods to check whether an element exists and find its position. These methods search through the list by comparing element values.
Method	Explanation
contains(Object o)	Checks whether an element exists in the LinkedList. Returns true or false.
indexOf(Object o)	Returns the index of the first occurrence of an element. Returns -1 if not found.
lastIndexOf(Object o)	Returns the index of the last occurrence of an element. Returns -1 if not found.

Important: A LinkedList allows duplicate elements. Therefore, indexOf() and lastIndexOf() can return different indices for the same value.
2. Problem statement
Write a Java program named ProblemF.java that performs the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 20, 50, 30, 60.
3. Display the original LinkedList.
4. Check whether the element 40 exists using contains().
5. Check whether the element 100 exists using contains().
6. Find the first occurrence of 20 using indexOf().
7. Find the last occurrence of 20 using lastIndexOf().
8. Find the first occurrence of 30.
9. Find the last occurrence of 30.
10. Search for the index of 90 and display the result.
3. Expected output
Original List: [10, 20, 30, 40, 20, 50, 30, 60]
Contains 40: true
Contains 100: false
First Occurrence of 20: 1
Last Occurrence of 20: 4
First Occurrence of 30: 2
Last Occurrence of 30: 6
Index of 90: -1 */
import java.util.LinkedList;
public class ProblemF {
    public static void main(String args[]){
        LinkedList<Integer> numbers= new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);
        numbers.add(60);

        System.out.println("Original List: " + numbers);
        System.out.println("Contain 40: " + numbers.contains(40));
        System.out.println("Contain 100: " + numbers.contains(100));
        System.out.println("First Index of 20: " + numbers.indexOf(20));
        System.out.println("Last index of 20: " + numbers.lastIndexOf(20));
        System.out.println("First Index of 30: " + numbers.indexOf(30));
        System.out.println("Last index of 30: "+ numbers.lastIndexOf(30));
        System.out.println("Last index of 90: "+ numbers.indexOf(90));

    }
}
