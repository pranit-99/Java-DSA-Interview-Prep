/*Problem A — Find a Target in a Sorted Array
Level 1 · Absolute Beginner
Problem statement
Given a sorted integer array and a target value, find the index where the target exists using Binary Search.

If the target is not present, return -1.

Input:
int[] arr = {3, 7, 11, 15, 19, 23, 27, 31, 35};
int target = 23;


Expected output:
Target found at index: 5 */
public class ProblemA {
    public static void main(String[] args) {
        int arr[] = {3, 7, 11, 15, 19, 23, 27, 31, 35};
        int target = 23;

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                result = mid;
                break;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println("Target found at:-" +result);
    }
}
