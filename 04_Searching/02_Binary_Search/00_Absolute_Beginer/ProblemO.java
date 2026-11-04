/*Problem O — Find the Largest Element Smaller Than the Target
1. Problem statement
Given a sorted integer array, find the largest element strictly smaller than the target using Binary Search.
int[] arr = {2, 5, 8, 12, 16, 20, 25};
int target = 15;


Expected output:
Largest smaller element: 12 */

public class ProblemO {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 20, 25};
        int target = 15;
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                result = arr[mid];
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("Largest smaller element: " + result);
    }
}

