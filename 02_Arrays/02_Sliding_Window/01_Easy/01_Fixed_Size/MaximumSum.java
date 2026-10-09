/*Problem 1 — Fixed Sliding Window
Maximum Sum of K Consecutive Elements
Given:
arr = {2, 1, 5, 1, 3, 2}
k = 3

Find the maximum sum of any 3 consecutive elements.
Expected output:
9

Because:
2 + 1 + 5 = 8
1 + 5 + 1 = 7
5 + 1 + 3 = 9  ← Maximum
1 + 3 + 2 = 6

Approach
First create the first window of size k:
[2, 1, 5] → 8

Then slide:
Remove 2
Add 1

[1, 5, 1] → 7

Continue the same way. */
public class MaximumSum {
    public static int findMaxSum(int arr[], int k){
        int windowSum = 0;

        //First Window
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;

        //Slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            if( windowSum > maxSum){
                maxSum = windowSum;
            }
        }
        return maxSum;
    }

    public static void main(String args[]){
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum Sum:" + findMaxSum(arr, k));
    }
}
