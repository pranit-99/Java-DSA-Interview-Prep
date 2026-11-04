/*ProblemM — Count Even Numbers in a List
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create a List<Integer>.
2. Add the integers 10, 15, 20, 25, 30, 35, 40.
3. Traverse the List using an enhanced for loop.
4. Count how many numbers are even.
5. Print the total count.
Input:
[10, 15, 20, 25, 30, 35, 40]


Expected Output:
Total Even Numbers: 4 */
import java.util.ArrayList;
import java.util.List;
public class ProblemM {
   public static void main(String args[]){
    int count = 0;
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

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2  == 0){
                count++;
            }
        }
        System.out.println(count);
   } 
}
