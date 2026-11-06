/*ProblemN — Check Whether One LinkedHashSet Contains All Elements of Another Using containsAll()
Absolute Beginner
 ProblemN.java
1. Theory: containsAll() Method
The containsAll() method checks whether one collection contains every element of another collection.
- Returns true if all elements of the specified collection are present.
- Returns false if even one element is missing.
- Does not modify either LinkedHashSet.
Syntax:
firstSet.containsAll(secondSet);


2. Problem Statement
Write a Java program that performs the following operations:
1. Create three LinkedHashSet<Integer> collections named firstSet, secondSet, and thirdSet.
2. Add 10, 20, 30, 40, 50, 60 to firstSet.
3. Add 20, 40, 60 to secondSet.
4. Add 20, 40, 80 to thirdSet.
5. Print all three LinkedHashSets.
6. Check whether firstSet contains all elements of secondSet.
7. Check whether firstSet contains all elements of thirdSet.
8. Print both boolean results. */
import java.util.LinkedHashSet;
public class ProblemN {
    public static void main(String args[]){
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

        LinkedHashSet<Integer> thirdSet = new LinkedHashSet<>();

        thirdSet.add(20);
        thirdSet.add(40);
        thirdSet.add(80);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);
        System.out.println("Third Set: " + thirdSet);

        boolean result1 = firstSet.containsAll(secondSet);
        boolean result2 = firstSet.containsAll(thirdSet);

        System.out.println("First Set Contains Second Set: " + result1);
        System.out.println("First Set Contains Third Set: " + result2);
    }
}
