/*Problem P — Find the First Element Greater Than or Equal to the Target
Level 1 · Absolute Beginner
For Problem P, we'll practice an important Binary Search variation: finding the first position where a condition becomes true.

This is slightly different from Problems N and O because equality is now allowed.

We'll follow our new learning approach: visualize → dry run → understand pointer movement → write code yourself.
1. Problem statement
Given a sorted integer array and a target, find the index of the first element greater than or equal to the target.

If no such element exists, return -1.
int[] arr = {2, 5, 8, 12, 16, 20, 25};
int target = 10;


Expected output:
First qualifying index: 3 */
public class ProblemP {
    public static void main(String args[]){
        int arr[] = {2, 5, 8, 12, 16, 20, 25};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] >= target){
                result  = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println("First qualifying index: " + result);
    }
}
