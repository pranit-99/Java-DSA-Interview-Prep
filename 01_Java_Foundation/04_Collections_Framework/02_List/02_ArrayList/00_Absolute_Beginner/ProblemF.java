/*ArrayList — Problem F: Find the Index of an Element Using indexOf()
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and find the index positions of specific elements using the indexOf() method.

Requirements:
1. Create an ArrayList<Integer>.
2. Add seven integers: 10, 20, 30, 40, 20, 50, 60.
3. Find the index of element 30.
4. Find the index of element 20.
5. Find the index of element 70.
6. Print appropriate messages for each result.
Expected Output
30 is present at index 2
20 is present at index 1
70 is not present in the ArrayList */
import java.util.ArrayList;
public class ProblemF {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(60);

        if(numbers.contains(30)){
            System.out.println("30 is Present at index "+numbers.indexOf(30));
        }else{
            System.out.println("30 is not present in the ArrayList");
        }

        if(numbers.contains(20)){
            System.out.println("20 is present at index "+numbers.indexOf(20));
        }else{
            System.out.println("20 is not present in the ArrayList");
        }

        if(numbers.contains(70)){
            System.out.println("70 is present at index "+numbers.indexOf(70));
        }else{
            System.out.println("70 is not present in the ArrayList");
        }
    }

}
