/*Problem Statement
Given an integer array containing duplicate values and a target, use Linear Search to find the index of the first occurrence of the target.
If the target does not exist, print "Element not found".
Example
arr = {5, 10, 20, 10, 30, 10}
target = 10

Output:
First occurrence at index: 1

Notice that 10 occurs at:
Index:    0   1   2   3   4   5
Array:   [5, 10, 20, 10, 30, 10]
             ↑       ↑       ↑
             1       3       5

We want only the first occurrence → index 1. */
public class FirstOccurrence {

    public static void main(String[] args) {

        int[] arr = {5, 10, 20, 10, 30, 10};
        int target = 10;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("First occurrence at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
