/*ProblemP — Convert LinkedList to Array Using toArray()
Topic: Java Collections Framework → LinkedList
Level: Absolute Beginner
New methods: toArray() and toArray(T[] array)
1. Theory — Understanding toArray()
The toArray() method converts the elements of a LinkedList into an array while preserving their order.
Method	Explanation	Return type
toArray()	Converts the LinkedList into an array of objects.	Object[]
toArray(T[] array)	Converts the LinkedList into an array of the specified reference type.	T[]

Important: Converting a LinkedList into an array does not remove or modify any elements in the original LinkedList.
Example
LinkedList<Integer> numbers = new LinkedList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);

Object[] firstArray = numbers.toArray();
Integer[] secondArray = numbers.toArray(new Integer[0]);


Both arrays contain the same values, but their declared element types are different.
2. Problem statement
Write a Java program named ProblemP.java that performs the following operations:
1. Create a LinkedList<Integer> named numbers.
2. Add elements 10, 20, 30, 40, 50.
3. Display the original LinkedList.
4. Convert the LinkedList into an Object[] using toArray().
5. Display every element of the Object[] using a traditional for loop.
6. Convert the LinkedList into an Integer[] using toArray(new Integer[0]).
7. Display every element of the Integer[] using an enhanced for loop.
8. Display the original LinkedList again to verify that it remains unchanged.
9. Print the length of both arrays.
3. Expected output
Original LinkedList: [10, 20, 30, 40, 50]

Object Array:
10 20 30 40 50

Integer Array:
10 20 30 40 50

Original LinkedList After Conversion: [10, 20, 30, 40, 50]
Object Array Length: 5
Integer Array Length: 5 */
import java.util.LinkedList;
public class ProblemP {
    public static void main(String args[]) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original LinkedList: " + numbers);

        // Convert LinkedList into Object Array
        Object[] firstArray = numbers.toArray();

        System.out.println("\nObject Array:");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        // Convert LinkedList into Integer Array
        Integer[] secondArray = numbers.toArray(new Integer[0]);

        System.out.println("\nInteger Array:");

        for (Integer num : secondArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Verify original LinkedList remains unchanged
        System.out.println("\nOriginal LinkedList After Conversion: " + numbers);

        // Print lengths of both arrays
        System.out.println("Object Array Length: " + firstArray.length);
        System.out.println("Integer Array Length: " + secondArray.length);
    }
}


