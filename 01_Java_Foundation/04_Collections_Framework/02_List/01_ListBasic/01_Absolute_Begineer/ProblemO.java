/*ProblemO — Find the Largest Number in a List
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add the integers 15, 40, 25, 80, 35, 60.
3. Find the largest number using a traditional for loop.
4. Print the largest number.
5. Do not use Collections.max() or sorting.
Input:
[15, 40, 25, 80, 35, 60]


Expected Output:
Largest Number: 80 */
import java.util.ArrayList;
import java.util.List;
public class ProblemO {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(40);
        numbers.add(25);
        numbers.add(80);
        numbers.add(35);
        numbers.add(60);

        int max = numbers.get(0);

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        System.out.println(max);
    }
}
