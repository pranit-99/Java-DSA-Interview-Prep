/*ProblemB — Insert Elements at Different Positions in LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

Methods covered: addFirst(), addLast(), add(index, element)
1. Problem statement
Write a Java program to perform the following operations:
1. Create a LinkedList of integers.
2. Add elements 10, 20, 30, 40, 50.
3. Insert 5 at the beginning of the LinkedList.
4. Insert 60 at the end of the LinkedList.
5. Insert 25 at index 3.
6. Display the final LinkedList.
2. Theory — Understanding the methods
Method	Explanation
addFirst(element)	Inserts an element at the beginning of the LinkedList. Existing elements shift one index forward.
addLast(element)	Inserts an element at the end of the LinkedList.
add(index, element)	Inserts an element at the specified index. Existing elements at that index and afterward move one index forward.

Important: In a LinkedList, elements are not physically shifted like they are in an ArrayList. Java updates node references internally, but it must first traverse the list to locate an insertion position when necessary. */
import java.util.LinkedList;
public class ProblemB {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        //Insert at Beginning
        numbers.addFirst(5);

        //Insert at end
        numbers.addLast(60);

        //Insert at specific index
        numbers.add(3, 25);

        System.out.println("Final List:-" + numbers);
    }
}
