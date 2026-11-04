/*Binary Search in an Array of Two Elements
Level 1 · Absolute Beginner
You have completed Problems A, B, and C. Now we will focus on a different situation: What happens when the array contains only two elements?

This problem will strengthen your understanding of boundary conditions, especially when left and right are very close to each other.
1. Problem statement
You are given a sorted array containing only two integers.

Your task is to find the target element using Binary Search.

If the target exists, print its index. Otherwise, print "Target not found".
2. Input
int[] arr = {10, 20};
int target = 20;


Expected output:
Target found at index: 1 */
public class ProblemD {
    public static void main(String args[]){
        int arr[] = {10, 20};
        int target = 20;
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left +(right - left) / 2;
            if(arr[mid] == target){
                result = mid;
                break;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
        if(result == -1){
            System.out.println("Target Not Found");
        }else{
            System.out.println("Target Found at " + result);
        }
    }
}
