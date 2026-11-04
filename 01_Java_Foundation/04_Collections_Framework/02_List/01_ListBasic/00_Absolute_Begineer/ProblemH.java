/*ProblemH — Check Whether a Value Exists Using contains()
Absolute Beginner
Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Check whether the value 30 exists in the List.
4. Print the result.
Expected Output
true */
import java.util.ArrayList;
import java.util.List;

public class ProblemH {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println(numbers.contains(30));

    }
}
