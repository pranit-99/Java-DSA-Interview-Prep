/*ProblemD — Update an Element Using set()
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add three integers: 10, 20, 30.
3. Change the second element from 20 to 50 using set().
4. Print the updated List.
Input:
[10, 20, 30]


Expected Output:
[10, 50, 30] */
import java.util.ArrayList;
import java.util.List;
public class ProblemD {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.set(1, 50);

        System.out.println(numbers);
    }
}
