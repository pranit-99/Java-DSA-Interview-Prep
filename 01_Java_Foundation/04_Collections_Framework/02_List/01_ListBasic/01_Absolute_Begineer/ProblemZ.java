/*ProblemZ — Sort a List Using sort()
Intermediate — Level 1
1. Problem Statement
Write a Java program to:
1. Create a List<Integer> named numbers.
2. Add the integers 50, 10, 40, 20, 30.
3. Print the original List.
4. Sort the List in ascending order using sort().
5. Print the sorted List.
Expected Output:
Before Sorting: [50, 10, 40, 20, 30]
After Sorting: [10, 20, 30, 40, 50] */

import java.util.ArrayList;
import java.util.List;

public class ProblemZ {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(25);
        numbers.add(30);
        numbers.add(20);
        numbers.add(35);

        System.out.println("Befor:" + numbers);

        numbers.sort(null);
        System.out.println("After:" + numbers);
    }
}
