/*Problem I — Check Whether a HashSet Contains All Elements of Another HashSet
Absolute Beginner
New Method: containsAll()

Theory (2–3 lines):
- The containsAll(Collection c) method checks whether the current HashSet contains every element of another collection.
- It returns true if all elements are present; otherwise, it returns false.
- This method does not modify either HashSet.
Problem Statement
1. Create a HashSet<Integer> named firstSet.
2. Add elements: 10, 20, 30, 40, 50, 60.
3. Create another HashSet<Integer> named secondSet.
4. Add elements: 20, 40, 60.
5. Create a third HashSet<Integer> named thirdSet.
6. Add elements: 20, 40, 80.
7. Print all three HashSets.
8. Check whether firstSet contains all elements of secondSet.
9. Check whether firstSet contains all elements of thirdSet.
10. Print the size of firstSet.
Expected Output
Element order may vary.
First Set: [10, 20, 30, 40, 50, 60]
Second Set: [20, 40, 60]
Third Set: [20, 40, 80]

Contains Second Set: true
Contains Third Set: false
First Set Size: 6 */
import java.util.HashSet;
public class ProblemI {
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
        

         HashSet<Integer> ThirdSet = new HashSet<>();
        ThirdSet.add(20);
        ThirdSet.add(40);
        ThirdSet.add(80);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + SecondSet);
        System.out.println("Third Set: " +ThirdSet);

        System.out.println("Contains Second set: "+firstSet.containsAll(SecondSet));
        System.out.println("Contains Third set: "+firstSet.containsAll(ThirdSet));
         System.out.println("Size: " +firstSet.size());


    }
}
