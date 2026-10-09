/*Problem 1 — Maximum Subarray Sum
Given an integer array containing positive and negative numbers, find the maximum sum of any contiguous subarray using Kadane’s Algorithm.
Input:
arr = {-2, 3, -1, 4, -5, 2}

Expected Output:
Maximum Subarray Sum: 6

Because the maximum-sum contiguous subarray is:
{3, -1, 4}

3 + (-1) + 4 = 6

Your task */
public class MaximumSubarraySum {
    public static int findMaxSum(int arr[]){
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] arr = {-2, 3, -1, 4, -5, 2};
        System.out.println("Maximum Sum: " + findMaxSum(arr));
    }
}
