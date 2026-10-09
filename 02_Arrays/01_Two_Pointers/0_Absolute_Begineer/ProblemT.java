/*Problem T: Count Pairs Where Both Elements Are Multiples of 5
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions contain two numbers that are both divisible by 5.
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:
arr = {10, 3, 15, 20, 7, 5}

Output: 2

Explanation:
(10, 5) → Both divisible by 5 → Count
(3, 7) → Not both divisible by 5
(15, 20) → Both divisible by 5 → Count


Example 2
Input:
arr = {2, 4, 6, 8}

Output: 0

Explanation:
No opposite-end pair contains two multiples of 5.


Example 3
Input:
arr = {25, 10, 4, 5, 15, 30}

Output: 3

Explanation:
(25, 30) → Count
(10, 15) → Count
(4, 5) → Do not count */

public class ProblemT {
    public static int countPairs(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            if (arr[left] % 5 == 0 && arr[right] % 5 == 0) {
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10, 3, 15, 20, 7, 5};

        System.out.println("Output: " + countPairs(arr));
    }
}

