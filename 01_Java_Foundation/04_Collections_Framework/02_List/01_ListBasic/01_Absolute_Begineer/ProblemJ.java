/*ProblemJ — Find the Last Index of a Duplicate Value
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add the integers 10, 20, 30, 20, 50.
3. Find the last index of the value 20 using lastIndexOf().
4. Print the index.
Input:
[10, 20, 30, 20, 50]


Expected Output:
3 */
import java.util.ArrayList;
import java.util.List;
public class ProblemJ {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println(numbers.lastIndexOf(20));
    }
}
