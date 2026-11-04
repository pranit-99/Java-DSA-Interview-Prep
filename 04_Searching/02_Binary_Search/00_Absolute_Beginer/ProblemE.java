/*Problem E — Binary Search in a Single-Element Array
Level 1 · Absolute Beginner
This is the 5th and final problem in our first Binary Search group (A–E).

So far, we have practiced finding existing targets, missing targets, the first element, and searching in a two-element array.

Now we'll test the smallest possible non-empty array: an array containing exactly one element.
1. Problem statement
You are given a sorted array containing only one integer.

Your task is to determine whether the target exists using Binary Search.
- If the target exists, print its index.
- Otherwise, print "Target not found".
2. Input
int[] arr = {25};
int target = 25;


Expected output:
Target found at index: 0 */
public class ProblemE {
   public static void main(String args[]){
    int arr[] = {25};
    int target = 25;
    int left  = 0;
    int right = arr.length - 1;
    int result = -1;

    while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] == target){
            result = mid;
            break;
        }else if(arr[mid] > target){
            right = mid - 1;
        }else{
            left = mid + 1;
        }
    }
    if(result == -1){
        System.out.println("Target Not Found");
    }else{
        System.out.println("Target Found at index:-" + result);
    }
   } 
}
