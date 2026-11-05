/*Problem L — Iterate Through a HashSet Using an Iterator
Absolute Beginner
New Concept: Iterator

Theory (2–3 lines):
- An Iterator is used to access elements of a collection one by one.
- iterator() creates an iterator, hasNext() checks whether another element exists, and next() retrieves it.
- HashSet iteration order is not guaranteed.
Problem Statement
1. Create a HashSet<Integer> named numbers.
2. Add elements: 10, 20, 30, 40, 50.
3. Print the original HashSet.
4. Create an Iterator<Integer> using iterator().
5. Use a while loop with hasNext() to traverse the HashSet.
6. Print each element using next().
7. Print the total number of elements using size(). */
import java.util.HashSet;
import java.util.Iterator;
public class ProblemL {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original HashSet: " + numbers);
        Iterator<Integer> itr = numbers.iterator();

        System.out.println("Iterator Elements: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
