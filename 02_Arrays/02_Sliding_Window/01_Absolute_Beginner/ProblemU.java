/*Problem U — Understand Longest Window Without Zero
Guided Solution 3 of 3
Java filename: U_LongestWindowWithoutZero.java
Problem Statement
Given an integer array, find the length of the longest contiguous subarray containing no zeros.
Input:
int[] arr = {1, 2, 0, 3, 4, 5, 0, 6, 7};


Expected output: */

public class ProblemU {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 3, 4, 5, 0, 6, 7};
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            // Zero breaks the current window
            if (arr[right] == 0) {
                left = right + 1;
            }

            // Calculate current valid window length
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }

        System.out.println(
            "Longest Window Without Zero: " + maxLength
        );
    }
}

