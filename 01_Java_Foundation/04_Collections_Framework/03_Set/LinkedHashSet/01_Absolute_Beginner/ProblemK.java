/*ProblemK — Combine Two LinkedHashSets Using addAll()
Absolute Beginner
 ProblemK.java

1. Theory: addAll() Method
The addAll() method adds all elements from one collection into another collection.
- It inserts only elements that are not already present.
- It preserves the existing insertion order and appends new elements in the source collection's iteration order.
- It returns true if the destination LinkedHashSet changes; otherwise, it returns false.
Syntax:
firstSet.addAll(secondSet);


2. Problem Statement
Write a Java program that performs the following operations:
1. Create two LinkedHashSet<Integer> collections named firstSet and secondSet.
2. Add 10, 20, 30, 40, 50 to firstSet.
3. Add 30, 40, 50, 60, 70 to secondSet.
4. Print both LinkedHashSets.
5. Use addAll() to combine the elements into firstSet.
6. Print the updated firstSet.
7. Print the total number of unique elements. */
import java.util.LinkedHashSet;
public class ProblemK {
    public static void main(String args[]){
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);
        firstSet.add(50);

        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
        secondSet.add(30);
        secondSet.add(40);
        secondSet.add(50);
        secondSet.add(60);
        secondSet.add(70);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);

        boolean isAdded = firstSet.addAll(secondSet);

        System.out.println("Elements Added: " + isAdded);
        System.out.println("Updated First Set: " + firstSet);
        System.out.println("Total Unique Elements: " + firstSet.size());


    }
}
