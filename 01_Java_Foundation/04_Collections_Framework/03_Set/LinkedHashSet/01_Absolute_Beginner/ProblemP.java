/*ProblemP — Remove Elements During Iteration Using Iterator.remove()
Absolute Beginner
 ProblemP.java
1. Theory: Iterator.remove() Method
The Iterator.remove() method safely removes the last element returned by next() while iterating through a LinkedHashSet.
- It removes an element from the original LinkedHashSet.
- It avoids ConcurrentModificationException when removing elements through the same iterator.
- It can be called only once per successful next() call.
Syntax:
Iterator<Integer> itr = numbers.iterator();

while (itr.hasNext()) {
    int num = itr.next();

    if (num % 2 == 0) {
        itr.remove();
    }
}


2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 15, 20, 25, 30, 35, 40, 45.
3. Print the original LinkedHashSet.
4. Create an Iterator<Integer>.
5. Traverse the LinkedHashSet using hasNext() and next().
6. Remove all even numbers using itr.remove().
7. Print the updated LinkedHashSet.
8. Print the total number of remaining elements. */
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProblemP {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);

        System.out.println("Original LinkedHashSet: " + numbers);

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {

            int num = itr.next();

            if (num % 2 == 0) {
                itr.remove();
            }
        }

        System.out.println("Updated LinkedHashSet: " + numbers);
        System.out.println("Remaining Elements: " + numbers.size());
    }
}