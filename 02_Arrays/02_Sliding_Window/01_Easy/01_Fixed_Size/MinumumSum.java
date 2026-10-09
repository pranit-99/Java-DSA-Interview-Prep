/*Problem 2 — Fixed Sliding Window: Minimum Sum
Given an integer array and k, find the minimum sum of any k consecutive elements.
Input
int[] arr = {4, 2, 1, 7, 3, 1, 2};
int k = 3;

Expected Output
Minimum Sum: 6

The windows are:
4 + 2 + 1 = 7
2 + 1 + 7 = 10
1 + 7 + 3 = 11
7 + 3 + 1 = 11
3 + 1 + 2 = 6  ← Minimum */
public class MinumumSum {
    public static int findMinSum(int arr[], int k){
        
            int windowSum = 0;

            //Create first window
            for(int i = 0; i < k; i++){
                windowSum = windowSum + arr[i];
            }
            int minSum = windowSum;

            for(int i = k; i < arr.length; i++){
                windowSum = windowSum - arr[i - k] + arr[i];

                if(windowSum < minSum){
                    minSum = windowSum;
                }
            }
            return minSum;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 7, 3, 1, 2};
        int k = 3;
        System.out.println("Minimum Sum: " + findMinSum(arr, k));
    }
}
