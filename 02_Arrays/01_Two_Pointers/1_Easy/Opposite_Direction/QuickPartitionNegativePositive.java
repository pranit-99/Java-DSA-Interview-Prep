/* Problem 18 (Q): Quick Partition of Negative and Positive Numbers
Easy
 Opposite-Direction Two Pointers

Java Filename: QuickPartitionNegativePositive.java
1. Problem statement
Given an unsorted integer array containing negative numbers, positive numbers, and zeros, rearrange the array so that:
- All negative numbers appear on the left.
- All zero and positive numbers appear on the right.
- You must modify the original array.
- The relative order of elements does not matter.
Example 1
Input:
arr = {4, -2, 7, -5, 0, -1}

Possible Output:
{-1, -2, -5, 7, 0, 4}


Example 2
Input:
arr = {-3, 6, -1, 8, -4, 2}

Possible Output:
{-3, -4, -1, 8, 6, 2}*/

import java.util.Arrays;
public class QuickPartitionNegativePositive {
    public static void partitionArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, -2, 7, -5, 0, -1};
        partitionArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

