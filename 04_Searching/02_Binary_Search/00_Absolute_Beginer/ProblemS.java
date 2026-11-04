/*Problem S — Search for a Target in a Rotated Sorted Array
Difficulty: Beginner
New concept: Identifying the sorted half of a rotated array to locate a target.
Problem statement
Given a rotated sorted integer array containing distinct elements, find the index of a target using Binary Search.

If the target does not exist, return -1.
Input
int[] arr = {15, 18, 21, 3, 6, 9, 12};
int target = 9;


Expected output:
Target found at index: 5 */
public class ProblemS {
   public static void main(String args[]){
    int arr[] = {15, 18, 21, 3, 6, 9, 12};
    int target = 9;
    int left = 0;
    int right = arr.length - 1;
    int result = -1;

    while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] == target){
            result = mid;
            break;
        }
        if(arr[left] <= arr[mid]){
            if(target >= arr[left] && target < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }else{
            if (target > arr[mid] && target <= arr[right]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
    }
    System.out.println("Target found at index: " + result);
   } 
}
