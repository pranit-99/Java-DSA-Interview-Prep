/*ProblemC — Access Elements from a LinkedList
Absolute Beginner
Topic: Java Collections Framework → LinkedList

Methods covered: get(), getFirst(), getLast()
1. Problem statement
Write a Java program that performs the following operations:
1. Create a LinkedList of integers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Retrieve the first element using getFirst().
4. Retrieve the last element using getLast().
5. Retrieve the element at index 2 using get().
6. Retrieve the element at index 4 using get().
7. Display all retrieved elements.
2. Theory — Understanding the methods
Method	Explanation
getFirst()	Retrieves the first element without removing it. Throws NoSuchElementException if the list is empty.
getLast()	Retrieves the last element without removing it. Throws NoSuchElementException if the list is empty.
get(index)	Retrieves the element at the specified index without removing it. Indexing starts from 0. */
import java.util.LinkedList;
public class ProblemC {
    public static void main(String args[]){
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List: " + numbers);

        //Reterieve first element
        System.out.println("First Element: " + numbers.getFirst());
        //Reterieve last Element
        System.out.println("Last Element: " + numbers.getLast());
        //Retrieve element at index 2
        System.out.println("Element at Index 2: " + numbers.get(2));
        //Reterieve element at index 4
        System.out.println("Element at Index 4: "+ numbers.get(4));

    }
}
