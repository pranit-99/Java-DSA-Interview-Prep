/*Problem S: Count Opposite-End Pairs with Equal Absolute Values
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array containing positive, negative, and zero values, count how many pairs at opposite positions have equal absolute values.
Two numbers have equal absolute values when their distance from zero is the same.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:
arr = {3, -5, 7, -7, 5, -3}

Output: 3

Explanation:
(3, -3) → Equal absolute values → Count
(-5, 5) → Equal absolute values → Count
(7, -7) → Equal absolute values → Count


Example 2
Input:
arr = {2, -4, 6, -3}

Output: 0

Explanation:
(2, -3) → Not equal
(-4, 6) → Not equal


Example 3
Input:
arr = {-8, 4, 0, 0, -4, 8}

Output: 3

Explanation:
(-8, 8) → Equal absolute values → Count
(4, -4) → Equal absolute values → Count
(0, 0) → Equal absolute values → Count*/

public class ProblemS {
    public static int countPairs(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            if (Math.abs(arr[left]) == Math.abs(arr[right])) {
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, -5, 7, -7, 5, -3};
        System.out.println("Output: " + countPairs(arr));
    }
}

