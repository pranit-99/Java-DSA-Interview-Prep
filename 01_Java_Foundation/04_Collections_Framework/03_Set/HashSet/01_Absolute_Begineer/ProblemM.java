/*Problem M — Iterate Through a HashSet Using a For-Each Loop
Absolute Beginner
New Concept: Enhanced for Loop (For-Each)

Theory (2–3 lines):
- The enhanced for loop is used to traverse elements of a collection without manually managing an index.
- It automatically accesses each element one by one.
- Unlike a traditional for loop, it does not require get(i) or an index variable.
Problem Statement
1. Create a HashSet<Integer> named numbers.
2. Add elements: 10, 20, 30, 40, 50, 60.
3. Print the original HashSet.
4. Use an enhanced for loop to iterate through the HashSet.
5. Print each element on a separate line.
6. Calculate the sum of all elements using the same loop.
7. Print the total sum.
Expected Output
HashSet iteration order may vary.
Original HashSet: [50, 20, 40, 10, 60, 30]

Elements:
50
20
40
10
60
30

Total Sum: 210*/
import java.util.HashSet;

public class ProblemM {
   public static void main(String[] args) {
       HashSet<Integer> numbers = new HashSet<>();
       
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(40);
       numbers.add(50);
       numbers.add(60);

       int sum = 0;

       System.out.println("Original HashSet:" +numbers);
       System.out.println("Elements");

       for(int num : numbers){
        System.out.println(num);
        sum = sum + num;
       }

       System.out.println("Total Sum: " + sum);

   } 
}
