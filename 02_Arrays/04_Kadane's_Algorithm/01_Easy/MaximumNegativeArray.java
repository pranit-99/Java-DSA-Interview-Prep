/*Problem 2 — Maximum Subarray Sum with All Negative Numbers
This problem is important because it teaches you why we initialize with arr[0].
Problem: Find the maximum contiguous subarray sum.
Input:
{-8, -3, -6, -2, -5, -4}

Output:
Maximum Sum: -2

Here the best subarray contains only {-2}. */
public class MaximumNegativeArray {

    public static int findMaxSum(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-8, -3, -6, -2, -5, -4};

        System.out.println("Maximum Sum: " + findMaxSum(arr));
    }
}
