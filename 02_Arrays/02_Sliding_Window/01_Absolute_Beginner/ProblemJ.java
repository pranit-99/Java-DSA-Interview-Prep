/*Problem J: Judge Window Sum Against Target
Pattern: Fixed-Size Sliding Window
Java filename: J_JudgeWindowSum.java
Problem Statement
Given an integer array arr, a window size k, and a target value, count how many contiguous windows of size k have a sum strictly greater than the target.
Input:
int[] arr = {2, 5, 1, 8, 3, 6, 4};
int k = 3;
int target = 12;


Expected output:
Number of windows: 3 */
public class ProblemJ {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 3, 6, 4};
        int k = 3;
        int target = 12;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
            if(sum > target){
                count++;
            }

        for(int i = k; i < arr.length; i++){
            sum  = sum - arr[i - k] + arr[i];
            if(sum > target){
                count++;
            }
        }
        System.err.println("Number of windows:-" + count);
    }
}
