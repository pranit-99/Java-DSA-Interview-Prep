/*Problem C — Find the First Element in a Sorted Array
Level 1 · Absolute Beginner
You have completed:
- Problem A: Find a target that exists in a sorted array.
- Problem B: Search for a target that does not exist.
Now, in Problem C, we will strengthen your understanding of how Binary Search behaves when the target is located at the very beginning of the array.

This is important because you need to understand how right moves repeatedly while left remains unchanged.
1. Problem statement
You are given a sorted array of integers.

Your task is to find the index of the target element using Binary Search.

This time, the target is located at index 0.
2. Input
int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45};
int target = 5;


Expected output:
Target found at index: 0 */

public class ProblemC {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if (result == -1) {
            System.out.println("Target not found");
        }
        else {
            System.out.println("Target found at index: " + result);
        }
    }
}

