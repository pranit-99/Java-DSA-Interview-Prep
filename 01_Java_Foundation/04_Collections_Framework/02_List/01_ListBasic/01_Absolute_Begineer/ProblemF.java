/*Problem Statement: Create a List containing 10, 20, 30, 40, 50. Remove the element at index 2 and print the remaining List.

Expected output:
[10, 20, 40, 50] */
import java.util.ArrayList;
import java.util.List;
public class ProblemF {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(2);

        System.out.println(numbers);
    }
}
