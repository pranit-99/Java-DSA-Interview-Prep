/*ProblemB — Find the Size of a List
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Find the total number of elements using the size() method.
4. Print the result.
Expected Output
Total elements: 5 */
import java.util.ArrayList;
import java.util.List;
public class ProblemB {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int totalElements = numbers.size();

        System.out.println("Total Elements: " + totalElements);
    }
    
}
