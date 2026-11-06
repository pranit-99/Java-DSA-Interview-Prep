/*ProblemG — Iterate Through a LinkedHashSet Using Iterator
Absolute Beginner
 ProblemG.java

1. Theory: Iterator, hasNext() and next()
An Iterator is an interface in Java that allows us to access elements of a collection one by one.

We will use three methods:
Method	Purpose	Return type
iterator()	Creates an iterator for the LinkedHashSet	Iterator<Integer>
hasNext()	Checks whether another element is available	boolean
next()	Retrieves the next element	Integer

Syntax:
Iterator<Integer> itr = numbers.iterator();


Important: The iterator visits LinkedHashSet elements in their insertion order.
2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 20, 30, 40, 50, 60.
3. Print the original LinkedHashSet.
4. Create an Iterator<Integer> object.
5. Use hasNext() to check whether another element exists.
6. Use next() to retrieve and print each element. */
import java.util.Iterator;
import java.util.LinkedHashSet;
public class ProblemG {
    public static void main(String args[]){
       LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original LinkedHashSet: " + numbers);
        Iterator<Integer> itr = numbers.iterator();

        System.out.println("LinkedHashSet Elements:");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
