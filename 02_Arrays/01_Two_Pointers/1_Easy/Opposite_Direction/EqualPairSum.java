/*Problem 6 (E): Equal Pair Sum After Removing Ends
Easy
 Independent Practice 1 of 10

Java Filename: EqualPairSum.java
Pattern: Array — Opposite-Direction Two Pointers
Pointer Movement: Conditional
Problem Statement
Given a sorted integer array and a target value, determine whether you can find two distinct elements whose sum equals the target.
However, there is an additional condition: you must return the indices of the pair, not just true or false.
Return an integer array containing the two indices in ascending order. If no pair exists, return {-1, -1}.
Example 1
Input:
arr = {1, 2, 3, 4, 6}
target = 6

Output:
{1, 3}

Explanation:
arr[1] + arr[3] = 2 + 4 = 6


Example 2
Input:
arr = {-5, -2, 0, 3, 7}
target = 5

Output:
{1, 4}

Explanation:
arr[1] + arr[4] = -2 + 7 = 5


Example 3
Input:
arr = {1, 3, 5, 7}
target = 20

Output:
{-1, -1} */

import java.util.Arrays;

public class EqualPairSum {
    public static int[] findPairIndices(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right++;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};
        int target = 6;
        int result[] = findPairIndices(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
