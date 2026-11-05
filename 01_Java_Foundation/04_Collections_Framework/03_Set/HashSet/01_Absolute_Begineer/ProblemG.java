/*Problem G — Retain Common Elements Between Two HashSets
Absolute Beginner
New Method: retainAll()

Theory (2–3 lines):
- The retainAll(Collection c) method keeps only elements that are also present in the specified collection.
- All other elements are removed from the HashSet on which the method is called.
- It returns true if the HashSet changes; otherwise, it returns false.
Problem Statement
1. Create a HashSet<Integer> named firstSet.
2. Add elements: 10, 20, 30, 40, 50, 60.
3. Create another HashSet<Integer> named secondSet.
4. Add elements: 20, 40, 60, 80.
5. Print both HashSets.
6. Use retainAll() to retain only common elements in firstSet.
7. Print the boolean result.
8. Print the updated firstSet and its size.
Expected Output
Element order may vary.
First Set: [10, 20, 30, 40, 50, 60]
Second Set: [20, 40, 60, 80]
RetainAll Result: true
Updated First Set: [20, 40, 60]
Size: 3 */
import java.util.HashSet;
public class ProblemG {
    public static void main(String[] args) {
        HashSet<Integer> firstSet = new HashSet<>();

        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);
        firstSet.add(50);
        firstSet.add(60);

        HashSet<Integer> SecondSet = new HashSet<>();
        SecondSet.add(20);
        SecondSet.add(40);
        SecondSet.add(60);
        SecondSet.add(80);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + SecondSet);
        System.out.println("RetainAll REsult: "+ firstSet.retainAll(SecondSet));
        System.out.println("Updated First Set: " + firstSet);
        System.out.println("Size: " +firstSet.size());




    }
}
