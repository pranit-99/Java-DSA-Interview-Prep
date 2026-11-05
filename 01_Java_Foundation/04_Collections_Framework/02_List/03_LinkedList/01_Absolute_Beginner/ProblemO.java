/*ProblemO — Clear and Clone a LinkedList
Level: Absolute Beginner
New methods: clear() and clone()
1. Theory
Method	Explanation
clear()	Removes all elements from the LinkedList.
clone()	Creates a shallow copy of the LinkedList.

clear() returns void, whereas clone() returns an Object that can be cast to LinkedList<Integer>.

A shallow copy creates a separate LinkedList structure, but the elements themselves are not deep-copied. This distinction matters for mutable objects.
2. Problem statement
Write ProblemO.java and perform the following:
1. Create a LinkedList named originalList.
2. Add 10, 20, 30, 40, 50.
3. Display the original list.
4. Create a copy named clonedList using clone().
5. Display the cloned list.
6. Add 60 to clonedList.
7. Display both lists to verify the original list has not changed.
8. Use clear() to remove all elements from originalList.
9. Display both lists again.
10. Print isEmpty() and size() for originalList.
3. Expected output
Original List: [10, 20, 30, 40, 50]
Cloned List: [10, 20, 30, 40, 50]
After Adding 60 to Clone: [10, 20, 30, 40, 50, 60]
Original List: [10, 20, 30, 40, 50]
After clear(): []
Cloned List: [10, 20, 30, 40, 50, 60]
Original List isEmpty(): true
Original List Size: 0 */

import java.util.LinkedList;

public class ProblemO {
    public static void main(String args[]) {

        LinkedList<Integer> originalList = new LinkedList<>();

        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        originalList.add(50);

        System.out.println("Original List: " + originalList);

        // Create a shallow copy of the original LinkedList
        @SuppressWarnings("unchecked")
        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        System.out.println("Cloned List: " + clonedList);

        // Add a new element to the cloned list
        clonedList.add(60);

        System.out.println("After Adding 60 to Clone: " + clonedList);
        System.out.println("Original List: " + originalList);

        // Remove all elements from the original list
        originalList.clear();

        System.out.println("After clear(): " + originalList);
        System.out.println("Cloned List: " + clonedList);

        // Verify that the original list is empty
        System.out.println("Original List isEmpty(): "
                + originalList.isEmpty());

        System.out.println("Original List Size: "
                + originalList.size());
    }
}

