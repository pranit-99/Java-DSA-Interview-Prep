/*Problem O — Overlapping Window Contribution
Easy · Fixed-Size Sliding Window · Mathematical Logic

Java file: OverlappingContribution.java
1. Problem statement
Given an integer array arr and a fixed window size k, find the sum of elements shared between every pair of consecutive windows.

You must solve this using the sliding-window technique without recalculating the overlapping elements from scratch.
2. Example
int arr[] = {2, 5, 3, 7, 4, 6};
int k = 3;


Expected output:
8
10
11 */
public class OverlappingWindow {
    public static void main(String args[]){
        int arr[] = {2, 5, 3, 7, 4, 6};
        int k = 3;
        int windowSum = 0;

        //Step 1: Calcu;ate first window sum
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        for(int i = k; i < arr.length; i++){
            int overlapSum = windowSum - arr[i - k];

            System.out.println(overlapSum);

            windowSum = windowSum - arr[i - k] + arr[i];
         }
    }
}
