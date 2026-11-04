/*ProblemP — Check Whether a List Is Empty
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create an empty List<Integer>.
2. Check whether the List is empty using isEmpty().
3. Add three integers: 10, 20, 30.
4. Check again whether the List is empty.
5. Print both results.
Expected Output
true
false */
import java.util.ArrayList;
import java.util.List;
public class ProblemP {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println(numbers.isEmpty());

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.isEmpty());
    }
}
