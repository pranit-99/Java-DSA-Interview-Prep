/*Problem C — Check Whether Elements Exist
Concepts: contains(), isEmpty()

Problem Statement:
1. Create a HashSet<Integer>.
2. Add 10, 20, 30, 40, and 50.
3. Check whether 30 exists.
4. Check whether 100 exists.
5. Check whether the HashSet is empty.
Solution: */
import java.util.HashSet;
public class ProblemC {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Contains 30: " + numbers.contains(30));
        System.out.println("Contains 100: " + numbers.contains(100));
        System.out.println("Is Empty: " + numbers.isEmpty());
    }
}
