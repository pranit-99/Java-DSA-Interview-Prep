/*ArrayList — Problem I: Insert Elements at Specific Indexes Using add(index, element)
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and insert new elements at specific index positions without replacing existing elements.
Requirements
1. Create an ArrayList<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Print the original ArrayList.
4. Insert 15 at index 1.
5. Insert 35 at index 4 of the updated ArrayList.
6. Insert 5 at the beginning of the ArrayList.
7. Print the final ArrayList and its size.
Expected Output
Original List: [10, 20, 30, 40, 50]
Final List: [5, 10, 15, 20, 30, 35, 40, 50]
Total Elements: 8 */
import java.util.ArrayList;
public class ProblemI {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List:-"+ numbers);

        numbers.add(1, 15);
        numbers.add(4, 35);
        numbers.add(0, 5);

        System.out.println("Final List:-"+ numbers);
        System.out.println("Size:-"+ numbers.size());


    }
}
