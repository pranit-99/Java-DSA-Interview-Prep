/*ProblemL — Print All Elements Using an Enhanced For Loop
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Traverse the List using an enhanced for loop (for-each).
4. Print each element on a separate line.
Expected Output:
10
20
30
40
50 */
import java.util.ArrayList;
import java.util.List;
public class ProblemL {
   public static void main(String[] args) {
       List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for(int num : numbers){
            System.out.println(num);
        }
   } 
}
