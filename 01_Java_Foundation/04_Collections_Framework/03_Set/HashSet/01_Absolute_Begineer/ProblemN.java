/*Problem N — Convert a HashSet into an Integer Array
Absolute Beginner
New Method: toArray(T[] a)

Theory (2–3 lines):
- The toArray(T[] a) method converts a HashSet into an array of a specified reference type.
- Unlike toArray(), which returns Object[], this method can return an Integer[].
- HashSet does not guarantee element order, so the array order may vary.
Problem Statement
1. Create a HashSet<Integer> named numbers.
2. Add elements: 10, 20, 30, 40, 50, 60.
3. Print the original HashSet.
4. Convert the HashSet into an Integer[] array using toArray().
5. Store the result in an array named arr.
6. Print each array element using a traditional for loop.
7. Print the length of the array.
Original HashSet: [50, 20, 40, 10, 60, 30]

Array Elements:
50
20
40
10
60
30

Array Length: 6 */
import java.util.HashSet;
public class ProblemN {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original Hashset: " + numbers);
        Integer arr[] = numbers.toArray(new Integer[0]);

        System.out.println("Array Elements:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Array Length: " + arr.length);
    }
}
