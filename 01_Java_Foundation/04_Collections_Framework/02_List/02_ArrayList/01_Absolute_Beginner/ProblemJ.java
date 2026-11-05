/*Problem Statement
Write a Java program to create an ArrayList<Integer> and remove specific elements by their values rather than their indexes.
Requirements
1. Create an ArrayList<Integer>.
2. Add seven integers: 10, 20, 30, 20, 40, 50, 60.
3. Print the original ArrayList.
4. Remove the first occurrence of value 20.
5. Remove the value 40.
6. Attempt to remove the value 70.
7. Print the final ArrayList and its size.
Expected Output
Original List: [10, 20, 30, 20, 40, 50, 60]
Final List: [10, 30, 20, 50, 60]
Total Elements: 5 */
import java.util.ArrayList;
public class ProblemJ {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List " + numbers);
        numbers.remove(Integer.valueOf(20));
        numbers.remove(Integer.valueOf(40));
        System.out.println("Final List " + numbers);
        System.out.println("Size " + numbers.size());
    }
}
