/*Problem F — Copy Elements from One HashSet to Another
Absolute Beginner
New Method: addAll()

Theory (2–3 lines):
- The addAll(Collection c) method adds all elements from another collection into the current HashSet.
- Duplicate elements are automatically ignored.
- It returns true if the HashSet changes after adding elements; otherwise, it returns false.
Problem Statement
1. Create a HashSet<Integer> named firstSet.
2. Add elements: 10, 20, 30, 40.
3. Create another HashSet<Integer> named secondSet.
4. Add elements: 30, 40, 50, 60.
5. Print both HashSets.
6. Use addAll() to add all elements from secondSet into firstSet.
7. Print the boolean result of addAll().
8. Print the updated firstSet and its size.
Expected Output
Element order may vary.
First Set: [20, 40, 10, 30]
Second Set: [50, 40, 60, 30]
AddAll Result: true
Updated First Set: [50, 20, 40, 10, 60, 30]
Size: 6 */
import java.util.HashSet;
public class ProblemF {
    public static void main(String args[]){
       HashSet<Integer> firstSet = new HashSet<>();
        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        firstSet.add(40);

        HashSet<Integer> secondSet = new HashSet<>();
        secondSet.add(30);
        secondSet.add(40);
        secondSet.add(50);
        secondSet.add(60);

        System.out.println("First Set: "+ firstSet);
        System.out.println("Second Set:"+ secondSet);
        System.out.println("AddAll REsult: "+ firstSet.addAll(secondSet));
        System.out.println("Updated First Set: "+ firstSet);
        System.out.println("Size: "+firstSet.size());

    }
}
