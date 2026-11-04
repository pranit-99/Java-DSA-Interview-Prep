/*ProblemK — Print All Elements Using a Traditional For Loop
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Use a traditional indexed for loop to traverse the List.
4. Print each element on a separate line.
Expected Output:
10
20
30
40
50 */
import java.util.ArrayList;
import java.util.List;
public class ProblemK {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
