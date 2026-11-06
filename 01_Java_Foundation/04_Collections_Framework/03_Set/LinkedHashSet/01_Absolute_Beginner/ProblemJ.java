/*ProblemJ — Count Even and Odd Numbers in a LinkedHashSet
Absolute Beginner
 ProblemJ.java

1. Theory: Modulo Operator %
The modulo operator % returns the remainder after dividing one number by another.
- num % 2 == 0 checks whether a number is even.
- num % 2 != 0 checks whether a number is odd.
- We use an enhanced for loop to examine every element in the LinkedHashSet.
Example:
10 % 2 == 0  // true: even
15 % 2 == 0  // false: odd


2. Problem Statement
Write a Java program that performs the following operations:
1. Create a LinkedHashSet<Integer> named numbers.
2. Add the elements 10, 15, 20, 25, 30, 35, 40, 45.
3. Print the original LinkedHashSet.
4. Count how many elements are even.
5. Count how many elements are odd.
6. Print both counts. */

import java.util.LinkedHashSet;

public class ProblemJ {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);

        System.out.println("Original LinkedHashSet: " + numbers);
        int evenCount = 0;
        int oddCount = 0;

        for(Integer num : numbers){
            if(num % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
