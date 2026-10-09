/*Problem 7 — List<Integer> and the remove() Trap

This is a small concept, but very important for Java interviews and debugging.

Problem Statement

Create a List<Integer> containing:

10
20
30
40
50

Perform two operations:

Remove the element at index 1.
Remove the value 40.

This demonstrates the difference between: */
import java.util.ArrayList;
import java.util.List;
public class NumberRemoval {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List:");
        System.out.println(numbers);

        numbers.remove(1);

        System.out.println("\nAfter removing index 1:");
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(40));

        System.out.println("\nAfter removing value 40:");
        System.out.println(numbers);
    }
}
