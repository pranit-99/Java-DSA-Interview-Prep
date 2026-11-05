/*ArrayList — Problem N: Find the Minimum Element in an ArrayList
Absolute Beginner
Problem Statement
Write a Java program to find the smallest element in an ArrayList<Integer> using a traditional for loop.
Requirements
1. Create an ArrayList<Integer>.
2. Add seven integers: 45, 20, 65, 10, 35, 5, 50.
3. Traverse the ArrayList using a traditional for loop.
4. Find the smallest element.
5. Print the minimum value.
6. Do not use Collections.min().
Expected Output
Minimum Element: 5 */
import java.util.ArrayList;

public class ProblemN {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(20);
        numbers.add(65);
        numbers.add(10);
        numbers.add(35);
        numbers.add(5);
        numbers.add(50);

        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}
