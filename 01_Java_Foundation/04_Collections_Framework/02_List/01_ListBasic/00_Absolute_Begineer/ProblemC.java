/*ProblemC — Print the First and Last Elements of a List
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Print the first element using get().
4. Print the last element using get(), without hardcoding its index.
Expected Output
First Element: 10
Last Element: 50 */
import java.util.ArrayList;
import java.util.List;

public class ProblemC {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int firstElement = numbers.get(0);
        int LastElement  = numbers.get(numbers.size() - 1);

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: "+ LastElement);

    }
}
