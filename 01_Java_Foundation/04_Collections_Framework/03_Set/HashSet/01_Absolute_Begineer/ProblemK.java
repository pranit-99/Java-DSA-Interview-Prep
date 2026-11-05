/*Problem K — Convert a HashSet into an Array
Absolute Beginner
New Method: toArray()

Theory (2–3 lines):
- The toArray() method converts all elements of a HashSet into an array.
- It returns an Object[] array by default.
- Since HashSet does not maintain insertion order, the array's element order is not guaranteed.
Problem Statement
1. Create a HashSet<Integer> named numbers.
2. Add elements: 10, 20, 30, 40, 50.
3. Print the original HashSet.
4. Convert the HashSet into an array using toArray().
5. Store the result in an Object[] array named arr.
6. Print all array elements using a for loop.
7. Print the length of the array.
Expected Output
Element order may vary.
Original HashSet: [50, 20, 40, 10, 30]
Array Elements:
50
20
40
10
30
Array Length: 5 */
import java.util.HashSet;
public class ProblemK {
   public static void main(String args[]){
    HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("\nOriginal HashSet: "+numbers);

        Object[] arr = numbers.toArray();

        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] +" ");
        }

        System.out.println("\nArray Length: "+ arr.length);
   } 
}
