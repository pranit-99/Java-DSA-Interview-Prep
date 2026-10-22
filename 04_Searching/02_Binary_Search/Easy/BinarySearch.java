/*Binary Search — Problem 1: Find Target in a Sorted Array
This is the basic Binary Search implementation you should be completely comfortable writing before moving to its patterns.
Problem Statement
Given a sorted integer array and a target, find the index of the target using Binary Search.
If the target doesn't exist, print "Element not found".
Example
arr = {10, 20, 30, 40, 50, 60, 70}
target = 50

Output:
Element found at index: 4

Important Requirement
Unlike Linear Search, standard Binary Search requires the array to be sorted. */
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int left = 0;
        int right = arr.length - 1;

        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
