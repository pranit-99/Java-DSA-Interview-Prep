/*ProblemL — Remove Common Elements Using removeAll()
Absolute Beginner
 ProblemL.java

1. Theory: removeAll() Method
The removeAll() method removes from one collection all elements that are also present in another collection.
- It modifies the LinkedHashSet on which the method is called.
- It returns true if at least one element is removed; otherwise, it returns false.
- The remaining elements maintain their original insertion order.
Syntax:
firstSet.removeAll(secondSet);


2. Problem Statement
Write a Java program that performs the following operations:
1. Create two LinkedHashSet<Integer> collections named firstSet and secondSet.
2. Add 10, 20, 30, 40, 50, 60 to firstSet.
3. Add 20, 40, 60, 80 to secondSet.
4. Print both LinkedHashSets.
5. Use removeAll() to remove common elements from firstSet.
6. Print the updated firstSet.
7. Print the total number of remaining elements. */
import java.util.LinkedHashSet;
public class ProblemL {
    public static void main(String args[]){
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();

        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);
        firstSet.add(50);
        firstSet.add(60);

        LinkedHashSet<Integer> secondSet  = new LinkedHashSet<>();
        secondSet.add(20);
        secondSet.add(40);
        secondSet.add(60);
        secondSet.add(80);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);

        boolean isRemoved = firstSet.removeAll(secondSet);
        System.out.println("Elements Removed: " + isRemoved);
        System.out.println("Updated First Set: " +firstSet);
        System.out.println("Updated First Set: " + firstSet);
        System.out.println("Remaining Elements: " + firstSet.size());

    }
}
