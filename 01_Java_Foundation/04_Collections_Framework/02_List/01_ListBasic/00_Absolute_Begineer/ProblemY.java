/*ProblemX — Remove Elements Using a Condition with removeIf()
Intermediate — Level 1
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add 10, 15, 20, 25, 30, 35, 40.
3. Use removeIf() to remove all even numbers.
4. Print the List before removing elements.
5. Print the List after removing elements.
Expected Output:
Before: [10, 15, 20, 25, 30, 35, 40]
After: [15, 25, 35]  */

import java.util.ArrayList;
import java.util.List;
public class ProblemY {
   public static void main(String[] args) {
       List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        System.out.println("Befor:" + numbers);
        numbers.replaceAll(num -> num * 2);
        System.out.println("After:" + numbers);

   } 
}
