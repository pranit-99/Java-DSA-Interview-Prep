/*ProblemS — Extract a Portion of a List Using subList()
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add the integers 10, 20, 30, 40, 50, 60, 70.
3. Print the original List.
4. Use subList() to extract elements from index 2 to index 5 (exclusive).
5. Print the extracted List.
6. Print the size of the extracted List.
Expected Output:
Original List: [10, 20, 30, 40, 50, 60, 70]
Sub List: [30, 40, 50]
Sub List Size: 3 */
import java.util.ArrayList;
import java.util.List;
public class ProblemS {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        List<Integer> extracted = numbers.subList(2, 7);

        System.out.println(extracted);
        System.out.println("Original List: " + numbers);
        System.out.println("Sub List Size: " + extracted.size());
    }
}
