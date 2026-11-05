/*Problem D — Remove Elements from a HashSet
Absolute Beginner
New Method: remove()

Theory (2–3 lines):
- The remove(Object o) method removes a specified element from a HashSet.
- It returns true if the element exists and is successfully removed.
- It returns false if the element does not exist. HashSet does not support removing elements by index.
Problem Statement
Create a HashSet<Integer> and perform the following operations:
1. Add elements: 10, 20, 30, 40, 50, 60.
2. Print the original HashSet.
3. Remove element 30.
4. Remove element 50.
5. Attempt to remove element 100.
6. Print the boolean result of each removal.
7. Print the updated HashSet and its size.
Expected Output
Example output — HashSet element order may vary.
Original HashSet: [50, 20, 40, 10, 60, 30]

Remove 30: true
Remove 50: true
Remove 100: false

Updated HashSet: [20, 40, 10, 60]
Size: 4 */
import java.util.HashSet;
public class ProblemD {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original HashSet:-" +numbers);
        System.out.println("Remove 30: " + numbers.remove(30));
        System.out.println("Remove 50: " + numbers.remove(50));
        System.out.println("Remove 100: " + numbers.remove(100));
        System.out.println("Updated HashSet:-" +numbers);
        System.out.println("Size:-" +numbers.size());
        

    }
}
