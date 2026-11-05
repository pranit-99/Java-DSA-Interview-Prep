/*Problem J — Compare Two HashSets for Equality
Absolute Beginner
New Method: equals()

Theory (2–3 lines):
- The equals(Object o) method checks whether two HashSets contain exactly the same elements.
- It returns true if both HashSets contain identical elements, regardless of insertion order.
- It returns false if their elements differ. Neither HashSet is modified.
Problem Statement
1. Create a HashSet<Integer> named firstSet.
2. Add elements: 10, 20, 30, 40.
3. Create another HashSet<Integer> named secondSet.
4. Add elements: 40, 30, 20, 10.
5. Create a third HashSet<Integer> named thirdSet.
6. Add elements: 10, 20, 30, 50.
7. Print all three HashSets.
8. Compare firstSet with secondSet using equals().
9. Compare firstSet with thirdSet using equals().
Expected Output
HashSet element order may vary.
First Set: [10, 20, 30, 40]
Second Set: [40, 30, 20, 10]
Third Set: [10, 20, 30, 50]

First vs Second: true
First vs Third: false */
import java.util.HashSet;
public class ProblemJ {
    public static void main(String args[]){
        HashSet<Integer> firstSet = new HashSet<>();

        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);

        HashSet<Integer> secondSet = new HashSet<>();
        secondSet.add(10);
        secondSet.add(20);
        secondSet.add(30);
        secondSet.add(40);

        HashSet<Integer> thirdSet = new HashSet<>();

        thirdSet.add(10);
        thirdSet.add(20);
        thirdSet.add(30);
        thirdSet.add(50);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);
        System.out.println("Third Set: " +thirdSet);

        System.out.println("First vs Second: " + firstSet.equals(secondSet));
        System.out.println("First vs Third: " + firstSet.equals(thirdSet));

    }
}
