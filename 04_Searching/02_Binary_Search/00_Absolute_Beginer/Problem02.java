/*Example 2 — Target Not Found in a Sorted Array
Absolute Beginner
In Example 1, we searched for an element that existed in the array.

Now we will understand what happens when the target does not exist, how Binary Search continues, and when the while loop stops.
1. Problem statement
Given a sorted array:
int[] arr = {3, 6, 9, 12, 15, 18, 21};
int target = 10;


Task: Search for 10 using Binary Search. If the target does not exist, return -1.

Expected output:
Target not found: -1 */
public class Problem02 {
    public static void main(String[] args) {
        int arr[] = {3, 6, 9, 12, 15, 18, 21};
        int target = 10;
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
        System.out.println("Target index:" + result);
    }
}
