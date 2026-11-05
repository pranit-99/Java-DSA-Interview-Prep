/*ProblemM — Add Multiple Elements Using addAll()
Absolute Beginner
Topic: Java Collections Framework → LinkedList

New methods: addAll(Collection) and addAll(index, Collection)
1. Theory — Understanding addAll()
The addAll() method allows us to insert multiple elements from one collection into another in a single operation.
Method	Explanation
addAll(collection)	Appends all elements of another collection to the end of the LinkedList.
addAll(index, collection)	Inserts all elements of another collection starting at the specified index.
Return value	Returns true if the LinkedList changes as a result of the operation.

Important: Unlike add(), which inserts one element, addAll() inserts an entire collection while preserving the order of its elements.
2. Problem statement
Write a Java program named ProblemM.java that performs the following operations:
1. Create a LinkedList named firstList.
2. Add elements 10, 20, 30, 40 to firstList.
3. Create another LinkedList named secondList.
4. Add elements 50, 60, 70 to secondList.
5. Display both LinkedLists.
6. Use addAll() to append all elements from secondList to firstList.
7. Create a third LinkedList named thirdList containing 100, 200.
8. Insert all elements from thirdList into firstList starting at index 2.
9. Display the final firstList.
10. Display the total number of elements in firstList.
3. Expected output
First List: [10, 20, 30, 40]
Second List: [50, 60, 70]
After addAll(): [10, 20, 30, 40, 50, 60, 70]
Third List: [100, 200]
Final List: [10, 20, 100, 200, 30, 40, 50, 60, 70]
Total Elements: 9 */
import java.util.LinkedList;
public class ProblemM {
    public static void main(String args[]){
        LinkedList<Integer> firstList = new LinkedList<>();

        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);

        LinkedList<Integer> secondList = new LinkedList<>();

        secondList.add(50);
        secondList.add(60);
        secondList.add(70);

        System.out.println("First List: " + firstList);
        System.out.println("Second List: " + secondList);

        firstList.addAll(secondList);
        System.out.println("After addAll(): " + firstList);

        LinkedList<Integer> thirdList = new LinkedList<>();

        thirdList.add(100);
        thirdList.add(200);

        System.out.println("Third List: " + thirdList);

        firstList.addAll(2, thirdList);
        System.out.println("Final List: " + firstList);
        System.out.println("Total Elements: " + firstList.size());
    }
}
