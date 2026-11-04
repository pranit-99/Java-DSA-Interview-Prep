/*ProblemQ — Remove All Elements Using clear()
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Print the List before removing its elements.
4. Remove all elements using clear().
5. Print the List after clearing it.
6. Print the size of the List.
Expected Output:
Before Clearing: [10, 20, 30, 40, 50]
After Clearing: []
Size: 0 */
import java.util.ArrayList;
import java.util.List;
public class ProblemQ {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println(numbers.isEmpty());

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Before Clearing: " + numbers);
        numbers.clear();
        System.out.println("After Clearing: " + numbers);
        System.out.println(numbers.size());
    }
}

