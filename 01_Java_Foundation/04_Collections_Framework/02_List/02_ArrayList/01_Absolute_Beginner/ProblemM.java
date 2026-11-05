/*ArrayList — Problem M: Find the Maximum Element in an ArrayList
Absolute Beginner
Problem Statement
Write a Java program to find the maximum element in an ArrayList<Integer> using a traditional for loop.
Requirements
1. Create an ArrayList<Integer>.
2. Add seven integers: 15, 40, 25, 80, 35, 60, 20.
3. Traverse the ArrayList using a traditional for loop.
4. Find the largest element.
5. Print the maximum value.
6. Do not use Collections.max().
Expected Output
Maximum Element: 80 */
import java.util.ArrayList;

public class ProblemM {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(40);
        numbers.add(25);
        numbers.add(80);
        numbers.add(35);
        numbers.add(60);
        numbers.add(20);

        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Maximum Element: " + max);
    }
}
