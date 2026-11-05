/*Problem A — Create a HashSet and Add Elements
Concepts: HashSet, add(), size()

Problem Statement:

Create a HashSet<Integer> and perform the following operations:
1. Add 10, 20, 30, 40, and 50.
2. Print the HashSet.
3. Print the total number of elements using size() */
import java.util.HashSet;

public class ProblemA {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("HashSet: " + numbers);
        System.out.println("Size: " + numbers.size());

    }
}
