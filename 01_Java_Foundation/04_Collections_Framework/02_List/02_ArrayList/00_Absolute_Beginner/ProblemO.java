/*ArrayList — Problem O: Count Even and Odd Numbers in an ArrayList
Absolute Beginner
Problem Statement
Write a Java program to count the total number of even and odd integers stored in an ArrayList<Integer> using a traditional for loop.
Requirements
1. Create an ArrayList<Integer>.
2. Add eight integers: 10, 15, 20, 25, 30, 35, 40, 45.
3. Traverse the ArrayList using a traditional for loop.
4. Count how many elements are even.
5. Count how many elements are odd.
6. Print both counts.
Expected Output
Even Numbers: 4
Odd Numbers: 4 */

import java.util.ArrayList;

public class ProblemO {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }
}

