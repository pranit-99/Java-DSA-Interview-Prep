/*Problem O — Observe Window Sum Changes
Absolute Beginner
Fixed-Size Sliding Window

1. Problem Statement
Given an integer array arr and a window size k, compare each window's sum with the previous window's sum.
Print:
- Increased if the current window sum is greater than the previous window sum.
- Decreased if the current window sum is smaller.
- Equal if both sums are the same.
Java filename: O_ObserveWindowSumChanges.java
2. Example
Input:
int[] arr = {2, 4, 1, 5, 3, 2, 6};
int k = 3;


Expected output:
Increased
Decreased
Equal
Increased */
public class ProblemO {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 5, 3, 2, 6};
        int k = 3;
        int previousSum ;
        int currentSum = 0;

        for(int i = 0; i < k; i++){
            currentSum = currentSum + arr[i]; 
        }
        previousSum = currentSum;

        for(int i = k; i < arr.length; i++){
            currentSum = currentSum - arr[i - k] + arr[i];
            if(currentSum > previousSum){
                System.out.println("Increased");
            }else if (currentSum < previousSum){
                System.out.println("Decreased");
            }else{
                System.out.println("Equal");
            }
            previousSum = currentSum;
        }
    }
}
