/*ArrayList — Problem H: Check Whether an ArrayList Is Empty Using isEmpty()
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and check whether it is empty before and after adding elements.
Requirements
1. Create an empty ArrayList<Integer>.
2. Check whether the ArrayList is empty.
3. Add five integers: 10, 20, 30, 40, 50.
4. Check whether the ArrayList is empty again.
5. Remove all elements using clear().
6. Check whether the ArrayList is empty after clearing it.
7. Print appropriate messages for each condition. */
import java.util.ArrayList;
public class ProblemH {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        if(numbers.isEmpty()){
            System.out.println("Initially the ArrayList is Empty");
        }else{
            System.out.println("Initially, the ArrayList is not empty");
        }

            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);

            if(numbers.isEmpty()){
            System.out.println("After adding elements, the ArrayList is empty");
        }else{
            System.out.println("After adding elements, the ArrayList is not empty");
        }
    }
}
