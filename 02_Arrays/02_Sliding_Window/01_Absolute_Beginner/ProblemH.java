/*Problem H: Highest Average Window
Pattern: Fixed-Size Sliding Window
Java filename: H_HighestAverageWindow.java
Problem Statement
Given an integer array arr and an integer k, find the highest average among all contiguous subarrays of size k.
Input:
int[] arr = {2, 5, 1, 8, 6, 3, 9};
int k = 3;


Expected output:
Highest Average: 6.0 */
public class ProblemH {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 6, 3, 9};
        int k = 3;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        double higestAverage = sum / k;

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            double average = sum / k;

            higestAverage = Math.max(average, higestAverage);
        }

        System.err.println("Highest Average: " + higestAverage);
    }
}
