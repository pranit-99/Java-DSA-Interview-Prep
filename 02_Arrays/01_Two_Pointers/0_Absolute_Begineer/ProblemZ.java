/*Problem Z: Count Pairs Whose Sum Is Greater Than Target
Easy
 Two Pointers – Conditional Movement

Problem Statement
Given a sorted integer array and a target value, count the total number of distinct index pairs (i, j) whose sum is strictly greater than the target.
Each pair must satisfy i < j.
Unlike the earlier opposite-end comparison problems, you must count all valid pairs, not just pairs at opposite positions.
Example 1
Input:
arr = {1, 2, 3, 4, 5}
target = 6

Output: 4

Explanation:
(2, 5) → 7 > 6 → Count
(3, 4) → 7 > 6 → Count
(3, 5) → 8 > 6 → Count
(4, 5) → 9 > 6 → Count


Example 2
Input:
arr = {2, 4, 6, 8}
target = 10

Output: 2

Explanation:
(4, 8) → 12 > 10 → Count
(6, 8) → 14 > 10 → Count */

public class ProblemZ {

    public static int countPairs(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > target) {
                count = count + (right - left);
                right--;
            } else {
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println("Output: " + countPairs(arr, target));
    }
}

