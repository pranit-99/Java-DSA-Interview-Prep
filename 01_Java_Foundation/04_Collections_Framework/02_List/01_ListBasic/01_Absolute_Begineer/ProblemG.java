/*ProblemG — Remove the First Matching Value
Absolute Beginner
Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add the integers 10, 20, 30, 20, 40.
3. Remove the first occurrence of the value 20, not the element at index 20.
4. Print the updated List.
Input:
[10, 20, 30, 20, 40]


Expected Output:
[10, 30, 20, 40] */
import java.util.ArrayList;
import java.util.List;
public class ProblemG {
    public static void main(String args[]){
       List<Integer> numbers = new ArrayList<>();

       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(20);
       numbers.add(50);

       numbers.remove(Integer.valueOf(20));

       System.out.println(numbers);
    }
}
