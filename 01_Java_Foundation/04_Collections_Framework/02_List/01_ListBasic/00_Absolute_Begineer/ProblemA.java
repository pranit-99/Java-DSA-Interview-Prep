/*ProblemA — Create a List and Add Elements
Absolute Beginner
Problem Statement
Write a Java program to:
1. Create an empty List<Integer>.
2. Add three integers: 10, 20, and 30.
3. Print the complete list.
Expected Output
[10, 20, 30] */
import java.util.ArrayList;
import java.util.List;
public class ProblemA {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
    }
}
