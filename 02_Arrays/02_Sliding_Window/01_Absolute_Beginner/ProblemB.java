/*Problem B — Biggest Sum of K Consecutive Elements
Guided solution 2 of 2
Problem: Find the maximum sum among all consecutive subarrays of size k.
Input:
arr = {3, 2, 5, 1, 6, 2}
k = 3


Expected output:
Maximum Sum: 12


Thinking approach
This is similar to Problem A, but instead of printing every sum, we need to remember the largest sum.
We introduce one extra variable: maxSum.
- Calculate the first window sum.
- Initialize maxSum with that sum.
- Slide the window and calculate the updated sum.
- Compare windowSum with maxSum.
- Keep the larger value. */
public class ProblemB {
    public static void main(String args[]){
        int arr[] = {3, 2, 5, 1, 6, 2};
        int k = 3;
        int windowSum = 0;

        //First Window
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        int maxSum = windowSum;

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.err.println("Maximum Sum:-" + maxSum);
    }
}
