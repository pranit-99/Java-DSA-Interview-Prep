/*ProblemM — Find Common Elements Using retainAll()
Absolute Beginner
 ProblemM.java
1. Theory: retainAll() Method
The retainAll() method keeps only those elements in a LinkedHashSet that are also present in another collection.
- Removes elements that are not common to both collections.
- Returns true if the LinkedHashSet changes; otherwise, returns false.
- Preserves the original insertion order of the remaining elements.
Syntax:
firstSet.retainAll(secondSet);


2. Problem Statement
Write a Java program that performs the following operations:
1. Create two LinkedHashSet<Integer> collections named firstSet and secondSet.
2. Add 10, 20, 30, 40, 50, 60 to firstSet.
3. Add 20, 40, 60, 80 to secondSet.
4. Print both LinkedHashSets.
5. Use retainAll() to keep only common elements in firstSet.
6. Print the updated firstSet.
7. Print the number of remaining elements. */
import java.util.LinkedHashSet;

public class ProblemM {
    public static void main(String[] args) {

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();

        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);
        firstSet.add(50);
        firstSet.add(60);

        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        secondSet.add(20);
        secondSet.add(40);
        secondSet.add(60);
        secondSet.add(80);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);

        boolean isRetained = firstSet.retainAll(secondSet);

        System.out.println("Set Modified: " + isRetained);
        System.out.println("Common Elements: " + firstSet);
        System.out.println("Total Common Elements: " + firstSet.size());
    }
}
