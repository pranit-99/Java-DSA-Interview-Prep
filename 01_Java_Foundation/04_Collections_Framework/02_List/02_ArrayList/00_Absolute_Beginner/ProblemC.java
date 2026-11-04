/*
ArrayList — Problem C: Update Elements Using set()
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and update specific elements using their indexes.

Requirements:

Create an ArrayList<Integer>.

Add five integers: 10, 20, 30, 40, 50.

Replace the second element with 25.

Replace the fourth element with 45.

Print the updated ArrayList.

Expected Output
Original List: [10, 20, 30, 40, 50]
Updated List: [10, 25, 30, 45, 50] */
import java.util.ArrayList;
public class ProblemC {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        numbers.set(1, 25);
        numbers.set(3, 45);

        System.out.println("Updated List:" + numbers);
    }
}
