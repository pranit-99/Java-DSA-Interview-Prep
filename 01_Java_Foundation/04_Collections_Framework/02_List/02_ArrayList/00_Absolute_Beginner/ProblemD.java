/*ArrayList — Problem D: Delete an Element Using remove()
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and remove specific elements using their indexes.

Requirements:
1. Create an ArrayList<Integer>.
2. Add six integers: 10, 20, 30, 40, 50, 60.
3. Print the original ArrayList.
4. Remove the element at index 2.
5. Remove the element at index 3 from the updated ArrayList.
6. Print the final ArrayList and its size.
Expected Output
Original List: [10, 20, 30, 40, 50, 60]
Updated List: [10, 20, 40, 60]
Total Elements: 4 */
import java.util.ArrayList;
public class ProblemD {
    public static void main(String args[]){
        ArrayList<Integer> numbers=  new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List: " +numbers);
        numbers.remove(2);
        System.out.println("Update List: "+numbers);
        numbers.remove(3);
        System.out.println("Final List: "+numbers);
        System.out.println("Size: "+numbers.size());

    }
}
