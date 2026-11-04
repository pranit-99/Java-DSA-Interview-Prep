/*ArrayList — Problem E: Check Whether an Element Exists Using contains()
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and check whether specific elements exist in the ArrayList.

Requirements:
1. Create an ArrayList<Integer>.
2. Add six integers: 10, 20, 30, 40, 50, 60.
3. Check whether 30 exists in the ArrayList.
4. Check whether 70 exists in the ArrayList.
5. Print appropriate messages for both conditions.
Expected Output
30 is present in the ArrayList
70 is not present in the ArrayList */
import java.util.ArrayList;
public class ProblemE {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        if(numbers.contains(30)){
            System.out.println("30 is present in the ArrayList");
        }else{
            System.out.println("30 is not present in the ArrayList");
        }

        if(numbers.contains(70)){
            System.out.println("70 is present in the ArrayList");
        }else{
            System.out.println("70 is not present in the ArrayList");
        }

    }
}
