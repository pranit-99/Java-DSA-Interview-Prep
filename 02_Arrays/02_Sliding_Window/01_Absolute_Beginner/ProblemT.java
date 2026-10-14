/*Problem T — Track Longest Subarray With Sum At Most Target
Guided Solution 2 of 3
Java filename: T_TrackLongestSubarray.java
Problem Statement
Given an array of nonnegative integers and a target, find the longest contiguous subarray whose sum is less than or equal to the target.
Input:
int[] arr = {2, 1, 3, 2, 1, 1, 4};
int target = 6;


Expected output:
Maximum Length: 4 */
public class ProblemT {
   public static void main(String[] args) {
       int arr[] = {2, 1, 3, 2, 1, 1, 4};
       int target = 6;

       int left = 0;
       int sum = 0;
       int maxLength = 0;

       for(int right = 0; right < arr.length; right++){
        //Expand Window
        sum = sum + arr[right];

        //Shrink invalid window
        while(sum > target){
            sum = sum - arr[left];
            left++;
        }

        //Update longest valid window
        int length = right - left + 1;
        maxLength = Math.max(maxLength, length);
       }
   } 
}
