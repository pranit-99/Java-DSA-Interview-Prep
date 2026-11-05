/*ProblemN — Remove and Retain Elements Using removeAll() and retainAll()
Topic: Java Collections Framework → LinkedList
Level: Absolute Beginner
New methods: removeAll(), retainAll()
1. Theory — Understanding the methods
Both methods compare elements between two collections, but they perform opposite operations.
Method	Explanation
removeAll(collection)	Removes every element from the current LinkedList that is also present in the specified collection.
retainAll(collection)	Keeps only elements in the current LinkedList that are also present in the specified collection.

Both methods return true if the current LinkedList changes, otherwise false.

Important: Both methods modify the LinkedList on which they are called, not the collection passed as the argument.
2. Problem statement
Write a Java program named ProblemN.java that performs the following operations:
1. Create a LinkedList named firstList containing 10, 20, 30, 40, 50, 60.
2. Create another LinkedList named secondList containing 20, 40, 60, 80.
3. Display both LinkedLists.
4. Create a separate copy of firstList named removeList.
5. Use removeAll(secondList) on removeList.
6. Display the updated removeList.
7. Create another separate copy of firstList named retainList.
8. Use retainAll(secondList) on retainList.
9. Display the updated retainList.
10. Display the sizes of both resulting lists.
3. Expected output
First List: [10, 20, 30, 40, 50, 60]
Second List: [20, 40, 60, 80]

After removeAll(): [10, 30, 50]
After retainAll(): [20, 40, 60]

Remove List Size: 3
Retain List Size: 3 */
import java.util.LinkedList;
public class ProblemN {
    public static void main(String args[]){

        LinkedList<Integer> firstList = new LinkedList<>();
        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);
        firstList.add(60);

        LinkedList<Integer> secondList = new LinkedList<>();
        secondList.add(20);
        secondList.add(40);
        secondList.add(60);
        secondList.add(80);

        System.out.println("First List: " + firstList);
        System.out.println("Second List: " + secondList);

        //Creating a copy for removeAll
        LinkedList<Integer> removeList = new LinkedList<>(firstList);
        removeList.removeAll(secondList);

        System.out.println("After removeALL():" + removeList);

        // Create a separate copy for retainAll()
        LinkedList<Integer> retainList = new LinkedList<>(firstList);

        retainList.retainAll(secondList);

        System.out.println("After retainAll(): " + retainList);

        System.out.println("Remove List Size: " + removeList.size());
        System.out.println("Retain List Size: " + retainList.size());

    }
}
