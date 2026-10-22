/*Problem 0 — Maximum Sum of K Consecutive Elements
Brush-up
Java file: Problem0.java

Problem Statement

Given an integer array arr and an integer k, find the maximum sum of any contiguous subarray of exactly k elements.

Example
int[] arr = {2, 1, 5, 1, 3, 2};
int k = 3;


Expected output: 9 */
public class Problem0 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int windowSum = 0;

        //Calculate first window sum
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        //Slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Maximum Sum: " + maxSum);
    }
}
