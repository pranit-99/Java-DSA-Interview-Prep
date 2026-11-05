/*ArrayList — Problem K: Traverse an ArrayList Using a Traditional for Loop
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and print each element individually using a traditional for loop.
Requirements
1. Create an ArrayList<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Traverse the ArrayList using a traditional for loop.
4. Print each element on a separate line.
5. Do not print the entire ArrayList directly.
Expected Output
10
20
30
40
50 */
import java.util.ArrayList;
public class ProblemK {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }
}
