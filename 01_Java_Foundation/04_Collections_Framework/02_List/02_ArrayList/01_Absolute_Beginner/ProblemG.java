/*ArrayList — Problem G: Find the Last Occurrence Using lastIndexOf()
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList<Integer> and find the last occurrence of specific elements using the lastIndexOf() method.
Requirements
1. Create an ArrayList<Integer>.
2. Add nine integers: 10, 20, 30, 20, 40, 50, 20, 60, 30.
3. Find the last index of element 20.
4. Find the last index of element 30.
5. Find the last index of element 50.
6. Find the last index of element 70.
7. Print appropriate messages for each result.
Expected Output
Last occurrence of 20 is at index 6
Last occurrence of 30 is at index 8
Last occurrence of 50 is at index 5
70 is not present in the ArrayList */
import java.util.ArrayList;
public class ProblemG {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(20);
        numbers.add(60);
        numbers.add(30);

        if(numbers.contains(20)){
            System.out.println("Last occurrence of 20 is at index "+numbers.lastIndexOf(20));
        }else{
            System.out.println("20 is not present in the ArrayList");
        }

        if(numbers.contains(30)){
            System.out.println("Last occurance of 30 is at index "+numbers.lastIndexOf(30));
        }else{
            System.out.println("30 is not present in the ArrayList");
        }

        if(numbers.contains(50)){
            System.out.println("Last occurance of 50 is at index "+numbers.lastIndexOf(50));
        }else{
            System.out.println("50 is not present in the ArrayList");
        }

        if(numbers.contains(70)){
            System.out.println("Last occurance of 70 is at index "+numbers.lastIndexOf(70));
        }else{
            System.out.println("70 is not present in the ArrayList");
        }
    }
}
