/*Problem U — Unique Maximum Window Sum
Easy · Fixed-Size Sliding Window · Frequency and Maximum

Java file: UniqueMaximum.java
1. Problem statement
Given an integer array arr and a fixed window size k, find the maximum window sum among windows containing no repeated elements.

A window is valid only if all k elements are distinct.

If no valid window exists, print -1.
2. Example
int arr[] = {2, 4, 2, 5, 3, 6, 3};
int k = 3;


Expected output:
14 */

public class UniqueMaximum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 5, 3, 6, 3};
        int k = 3;
        int freq[] = new int[10];
        int windowSum = 0;
        int duplicateCount = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean found = false;

        // Step 1: Create first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
            freq[arr[i]]++;
            if (freq[arr[i]] == 2) {
                duplicateCount++;
            }
        }

        // Step 2: Check first window
        if (duplicateCount == 0) {
            maxSum = windowSum;
            found = true;
        }

        // Step 3: Slide the window
        for (int i = k; i < arr.length; i++) {
            int outgoing = arr[i - k];
            int incoming = arr[i];
            // Remove outgoing element
            windowSum -= outgoing;
            if (freq[outgoing] == 2) {
                duplicateCount--;
            }

            freq[outgoing]--;
            // Add incoming element
            windowSum += incoming;
            freq[incoming]++;
            if (freq[incoming] == 2) {
                duplicateCount++;
            }

            // Step 4: Check valid window
            if (duplicateCount == 0) {
                if (!found || windowSum > maxSum) {
                    maxSum = windowSum;
                }
                found = true;
            }
        }

        // Step 5: Print result
        if (found) {
            System.out.println("Maximum Unique Window Sum: " + maxSum);
        } else {
            System.out.println(-1);
        }
    }
}

