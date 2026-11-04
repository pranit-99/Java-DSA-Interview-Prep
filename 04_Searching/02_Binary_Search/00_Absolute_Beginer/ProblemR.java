/*Problem R — Find the Minimum Element in a Rotated Sorted Array
Difficulty: Absolute Beginner
New concept: Binary Search on a rotated sorted array.
Problem statement
Given a sorted integer array that has been rotated, find the minimum element using Binary Search.

Assume all elements are distinct and the array is nonempty.

Input:
int[] arr = {15, 18, 21, 3, 6, 9, 12};


Expected output:
Minimum element: 3
Minimum index: 3 */
public class ProblemR {
    public static void main(String[] args) {
        int arr[]  = {15, 18, 21, 3, 6, 9, 12};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        System.out.println("Minimum element: " + arr[left]);
        System.out.println("Minimum index: " + left);
    }
}
