/*ArrayList — Problem L: Calculate the Sum of All Elements
Absolute Beginner
Problem Statement
Write a Java program to calculate the sum of all integers stored in an ArrayList<Integer> using a traditional for loop.
Requirements
1. Create an ArrayList<Integer>.
2. Add six integers: 10, 20, 30, 40, 50, 60.
3. Traverse the ArrayList using a traditional for loop.
4. Calculate the sum of all elements.
5. Print the final sum.
Expected Output
Sum of all elements: 210 */
import java.util.ArrayList;
public class ProblemL {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        for(int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }

        System.out.println("Sum of all elements:" + sum);
    }
    
}
