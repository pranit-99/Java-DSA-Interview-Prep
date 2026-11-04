/*ProblemN — Calculate the Sum of All Integers in a List
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add the integers 10, 20, 30, 40, 50.
3. Traverse the List using a traditional for loop.
4. Calculate the sum of all elements.
5. Print the final sum.
Input:
[10, 20, 30, 40, 50]


Expected Output:
Total Sum: 150 */
import java.util.ArrayList;
import java.util.List;
public class ProblemN {
   public static void main(String args[]){
    int sum = 0;
       List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for(int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
   } 
}
