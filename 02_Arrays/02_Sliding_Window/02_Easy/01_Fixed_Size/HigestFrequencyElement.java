/*Problem H — Highest Frequency Element in Each Window
Easy
Fixed-Size Sliding Window

HighestFrequency.java

1. Problem Statement
Given an integer array arr and an integer k, find the most frequently occurring element in every contiguous subarray of exactly size k.

If multiple elements have the same highest frequency, return the smallest element among them.

You must use a genuine fixed-size sliding-window approach.
Example
int arr[] = {1, 2, 2, 3, 3, 3};
int k = 3;


Expected output:
2
2
3
3


2. Example explanation
Window	Frequencies	Most frequent
[1, 2, 2]	1→1, 2→2	2
[2, 2, 3]	2→2, 3→1	2
[2, 3, 3]	2→1, 3→2	3
[3, 3, 3]	3→3	3 */
public class HigestFrequencyElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3};
        int k = 3;
        int freq[] = new int[10];

        for(int i = 0; i < k; i++){
            freq[arr[i]]++;
        }

        int maxFrequency = 0;
        int result = -1;

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxFrequency){
                maxFrequency = freq[i];
                result = i;
            }
        }

        System.out.println(result);

        for(int i = k; i < arr.length; i++){
            freq[arr[i - k]]--;

            freq[arr[i]]++;

            maxFrequency = 0;
            result = -1;

            for(int j = 0; j < freq.length; j++){
                if(freq[j] > maxFrequency){
                    maxFrequency = freq[i];
                    result = j;
                }
            }
            System.out.println(result);
        }
    }
}
