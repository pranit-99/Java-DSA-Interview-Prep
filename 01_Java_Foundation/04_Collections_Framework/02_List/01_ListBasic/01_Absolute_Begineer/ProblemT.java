/*ProblemT — Convert a List into an Array Using toArray()
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Convert the List into an Integer[] array using toArray().
4. Print all array elements using a traditional for loop.
5. Print the length of the array.
Expected Output:
10
20
30
40
50
Array Length: 5 */
import java.util.ArrayList;
import java.util.List;

public class ProblemT {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Integer[] arr = numbers.toArray(new Integer[0]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Array Length: " + arr.length);
    }
}