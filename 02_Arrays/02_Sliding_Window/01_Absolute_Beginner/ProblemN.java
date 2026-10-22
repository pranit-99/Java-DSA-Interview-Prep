/*Problem N — Number of Windows With Equal Sum
Absolute Beginner
Fixed-Size Sliding Window

1. Problem Statement
Given an integer array arr, a window size k, and a target sum, count how many contiguous windows of size k have a sum exactly equal to the target.
Java filename: N_NumberOfWindowsWithEqualSum.java
2. Example
Input:
int[] arr = {2, 3, 1, 4, 2, 3, 1};
int k = 3;
int target = 6;


Expected output:
Number of Windows: 3*/
public class ProblemN {
    public static void main(String args[]){
        int arr[] = {2, 3, 1, 4, 2, 3, 1};
        int k = 3;
        int target = 6;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        if(sum == target){
            count++;
        }

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            if(sum == target){
                count++;
            }
        }
        System.err.println("Number of Windows:-" + count);
    }
}
