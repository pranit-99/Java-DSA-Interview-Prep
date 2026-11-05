/*Problem E — Clear All Elements from a HashSet
Absolute Beginner
New Method: clear()

Theory (2–3 lines):
- The clear() method removes all elements from a HashSet.
- It does not delete the HashSet object itself.
- After calling clear(), the HashSet becomes empty, and its size becomes 0.
Problem Statement
1. Create a HashSet<Integer>.
2. Add elements: 10, 20, 30, 40, 50.
3. Print the original HashSet.
4. Print its size before clearing.
5. Remove all elements using clear().
6. Print the updated HashSet.
7. Print its size and check whether it is empty using isEmpty().
Expected Output
Original HashSet: [50, 20, 40, 10, 30]
Size Before: 5
Updated HashSet: []
Size After: 0
Is Empty: true */
import java.util.HashSet;
public class ProblemE {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original HashSet: " + numbers);
        System.out.println("Size Before: " + numbers.size());
        numbers.clear();
        System.out.println("Updated Hashset: " + numbers);
        System.out.println("Size After " + numbers.size());
        System.out.println("Is Empty: " + numbers.isEmpty());
    }
}
