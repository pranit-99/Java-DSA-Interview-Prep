/*ArrayList — Problem B: Access Elements Using Index
Absolute Beginner
Problem Statement
Write a Java program to create an ArrayList containing five integers and access specific elements using their indexes.

Requirements:
1. Create an ArrayList<Integer>.
2. Add five integers: 10, 20, 30, 40, 50.
3. Print the first element.
4. Print the third element.
5. Print the last element.

Expected Output
First Element: 10
Third Element: 30
Last Element: 50 */
import java.util.ArrayList;
public class ProblemB {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("First Element: "+ numbers.get(0));
        System.out.println("Third Element: "+ numbers.get(2));
        System.out.println("Last Element: "+ numbers.get(numbers.size() - 1));
    }
}
