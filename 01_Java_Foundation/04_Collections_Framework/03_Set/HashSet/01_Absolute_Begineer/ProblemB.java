/*Problem B — Add Duplicate Elements
Concepts: add(), duplicate handling, boolean return value

Problem Statement:
1. Create a HashSet<Integer>.
2. Add 10, 20, 30, and 40.
3. Try adding 20 and 30 again.
4. Print the result of each duplicate insertion.
5. Print the final HashSet and its size.
Solution: */
import java.util.HashSet;
public class ProblemB {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Add 20 again: "+ numbers.add(20));
        System.out.println("Add 30 again: "+ numbers.add(30));

        System.out.println("Final HashSet: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}
