/* Problem 17 (P): Pair Elements to Minimize Maximum Sum
Easy guided practice
 Arrays — Opposite-Direction Two Pointers

Java Filename: PairElementsMinimizeMaxSum.java
1. Problem statement
Given an integer array containing an even number of elements, divide all elements into pairs so that the largest pair sum is as small as possible.
Return that smallest possible maximum pair sum.
Each element must belong to exactly one pair.
Example
Input:
arr = {3, 5, 2, 3}

Output:
7


Why?
One possible pairing:
(3, 5) = 8
(2, 3) = 5

Maximum pair sum = 8


A better pairing:
(2, 5) = 7
(3, 3) = 6

Maximum pair sum = 7 */

import java.util.Arrays;

public class PairElementsMinimizeMaxSum {

    public static int minimizeMaximumPairSum(int[] arr) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int maxSum = Integer.MIN_VALUE;

        while (left < right) {

            int pairSum = arr[left] + arr[right];

            if (pairSum > maxSum) {
                maxSum = pairSum;
            }

            left++;
            right--;
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 3};

        System.out.println(
            minimizeMaximumPairSum(arr)
        );
    }
}

