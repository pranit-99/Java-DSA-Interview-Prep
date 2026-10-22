/*Next — Problem Q: Quantify Windows Above Average
Filename: Q_QuantifyWindowsAboveAverage.java
Problem Statement
Given an integer array and window size k, count how many windows of size k have a sum greater than the equivalent window-size portion of the average of the entire array.
Input:
int[] arr = {2, 4, 6, 8, 10, 3, 1};
int k = 3;


Your task: Calculate the whole-array average, then count every window whose sum is greater than k × average.
Hint: To avoid decimal division, compare:
windowSum * arr.length > totalSum * k


Use long for the multiplication if values might be large. */

public class ProblemQ {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 3, 1};
        int k = 3;
        int totalSum = 0;
        int windowSum = 0;
        int count = 0;
        // Step 1: Calculate total array sum
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        // Step 2: Calculate first window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        // Check first window
        if ((long) windowSum * arr.length > (long) totalSum * k) {
            count++;
        }
        // Step 3: Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            if ((long) windowSum * arr.length > (long) totalSum * k) {
                count++;
            }
        }
        System.out.println("Windows Above Average: " + count);
    }
}
