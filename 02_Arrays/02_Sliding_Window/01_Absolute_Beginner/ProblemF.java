/*Problem F — Find Minimum Window Sum
Absolute Beginner
Fixed-Size Sliding Window

1. Problem Statement
Given an integer array arr and an integer k, find the minimum sum among all contiguous subarrays of size k.
Java filename: F_FindMinimumWindowSum.java
2. Example
Input:
int[] arr = {4, 2, 7, 1, 3, 6, 2};
int k = 3;


Expected Output:
Minimum Window Sum: 10 */
public class ProblemF {
    public static void main(String args[]){
        int arr[] = {4 , 2, 7, 1, 3, 6, 2};
        int k = 3;
        int sum  = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        int min = sum;

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            min = Math.min(min, sum);
        }
        System.err.println("Minimum Sum:-" +min);
    }
}
