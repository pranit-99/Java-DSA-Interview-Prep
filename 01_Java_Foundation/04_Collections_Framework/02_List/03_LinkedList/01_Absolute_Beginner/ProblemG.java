/*ProblemG — Traversing a LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

Concepts: Traditional for loop, enhanced for loop, and Iterator
1. Theory — Understanding traversal
Traversal means visiting every element in a LinkedList, usually from beginning to end.
Approach	Explanation
Traditional for loop	Uses an index and get(i) to access each element.
Enhanced for loop	Visits elements sequentially without manually managing an index.
Iterator	Provides hasNext() and next() methods to traverse elements one by one.

Important: For a LinkedList, the enhanced for loop and Iterator are generally more efficient than repeatedly using get(i).
2. Problem statement
Write a Java program named ProblemG.java that:
1. Creates a LinkedList containing 10, 20, 30, 40, 50, 60.
2. Displays the elements using a traditional for loop.
3. Displays the elements using an enhanced for loop.
4. Displays the elements using an Iterator. */
import java.util.Iterator;
import java.util.LinkedList;
public class ProblemG {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List: " + numbers);
        System.out.println("traditional For Loop: ");
        for(int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        
        System.out.println("\nEnhanced Loop: ");
        for(int num : numbers){
            System.out.print(num + " ");
        }

        System.out.println("\nIterator: ");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
