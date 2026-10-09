/*Problem Q: Count Pairs Where the Left Element Is Smaller Than the Right Element
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions satisfy the condition:
arr[left] < arr[right]
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:
arr = {2, 8, 4, 7, 10, 6}

Output: 2

Explanation:
(2, 6)  → 2 < 6  → Count
(8, 10) → 8 < 10 → Count
(4, 7)  → 4 < 7  → Count


Correct output: 3
Example 2
Input:
arr = {9, 7, 5, 3, 1}

Output: 0

Explanation:
(9, 1) → Not smaller
(7, 3) → Not smaller


Example 3
Input:
arr = {3, 8, 6, 2, 9, 5}

Output: 2

Explanation:
(3, 5) → Count
(8, 9) → Count
(6, 2) → Do not count */
public class ProblemQ {
    public static int countPairs(int arr[]){
        int left  = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] < arr[right]){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 8, 4, 7, 10, 6};
        System.out.println(countPairs(arr));
    }
}
