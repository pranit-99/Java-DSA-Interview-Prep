/*ArrayList — Problem A: Add and Display Elements
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer>, add five integers, and display all the elements.

Requirements:
1. Create an ArrayList using the List interface.
2. Add five integers: 10, 20, 30, 40, 50.
3. Print the entire ArrayList.
4. Print the total number of elements.
Expected Output
Elements: [10, 20, 30, 40, 50]
Total Elements: 5 */
import java.util.ArrayList;
public class ProblemA {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Elements: " + numbers);

        System.out.println("Total Elements: " + numbers.size());
    }
}
