/*Problem D — Detect Duplicate Elements in Windows
Easy
Fixed-Size Sliding Window

DetectDuplicates.java

1. Problem Statement
Given an integer array arr and an integer k, count how many contiguous subarrays of exactly size k contain at least one duplicate element.

Use only basic arrays, loops, and conditions. No HashMap or HashSet.
Example
int arr[] = {1, 2, 2, 3, 4, 4};
int k = 3;


Expected output: 3
Window	Duplicate?	Count
[1, 2, 2]	Yes (2)	1
[2, 2, 3]	Yes (2)	2
[2, 3, 4]	No	2
[3, 4, 4]	Yes (4)	3 */
public class DeleteDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4};
        int k = 3;
        int count = 0;
        int freq[] = new int[10];
        int duplicateCount = 0;

        //Step1 Moving through each window
        for(int i = 0; i < k; i++){
            freq[arr[i]]++;

            if(freq[arr[i]] == 2){
                duplicateCount++;
            }
        }

        //Step2: check first window
        if(duplicateCount > 0){
            count++;
        }

        // Step 3: Slide the window
        for (int i = k; i < arr.length; i++) {

            int outgoing = arr[i - k];
            int incoming = arr[i];

            // Remove outgoing element
            if (freq[outgoing] == 2) {
                duplicateCount--;
            }
            freq[outgoing]--;

            // Add incoming element
            freq[incoming]++;

            if (freq[incoming] == 2) {
                duplicateCount++;
            }

            // Step 4: Check current window
            if (duplicateCount > 0) {
                count++;
            }
        }

        System.out.println("Duplicate Windows: " + count);
    }
}
