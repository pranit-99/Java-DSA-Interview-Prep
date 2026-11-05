/*Problem O — Clone a HashSet
Absolute Beginner
New Method: clone()

Theory (2–3 lines):
- The clone() method creates a shallow copy of an existing HashSet.
- It returns an Object, so casting is needed when assigning the result to a HashSet<Integer>.
- Adding or removing elements from the cloned HashSet does not change the original HashSet.
Problem Statement
1. Create a HashSet<Integer> named originalSet.
2. Add elements: 10, 20, 30, 40, 50.
3. Print the original HashSet.
4. Create a copy named clonedSet using clone().
5. Print the cloned HashSet.
6. Add 60 to clonedSet.
7. Remove 20 from clonedSet.
8. Print both HashSets after modification.
9. Print the size of both HashSets. */

import java.util.HashSet;

public class ProblemO {
    public static void main(String[] args) {

        HashSet<Integer> originalSet = new HashSet<>();

        originalSet.add(10);
        originalSet.add(20);
        originalSet.add(30);
        originalSet.add(40);
        originalSet.add(50);

        System.out.println("Original Set: " + originalSet);

        @SuppressWarnings("unchecked")
        HashSet<Integer> clonedSet =
            (HashSet<Integer>) originalSet.clone();

        System.out.println("Cloned Set: " + clonedSet);

        clonedSet.add(60);
        clonedSet.remove(20);

        System.out.println("\nAfter Modification:");
        System.out.println("Original Set: " + originalSet);
        System.out.println("Cloned Set: " + clonedSet);

        System.out.println("Original Size: " + originalSet.size());
        System.out.println("Cloned Size: " + clonedSet.size());
    }
}

