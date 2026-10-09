/*Problem Y: Count Pairs Whose Sum Is Less Than Target
Easy
 Two Pointers – Conditional Movement

Problem Statement
Given a sorted integer array and a target value, count the total number of distinct index pairs (i, j) whose sum is strictly less than the target.
Unlike our earlier problems, you must consider all possible pairs, not just elements at opposite positions.
Each pair must satisfy i < j.
Example 1
Input:
arr = {1, 2, 3, 4, 5}
target = 6

Output: 6

Explanation:
(1, 2) → 3 < 6
(1, 3) → 4 < 6
(1, 4) → 5 < 6
(2, 3) → 5 < 6
(2, 4) → 6 is not less than 6
(1, 5) → 6 is not less than 6
(3, 4) → 7 is not less than 6


Correction: The output for Example 1 is 4, corresponding to the four qualifying pairs shown.
Example 2
Input:
arr = {2, 4, 6, 8}
target = 10

Output: 2

Explanation:
(2, 4) → 6 < 10
(2, 6) → 8 < 10


Example 3
Input:
arr = {-3, -1, 2, 4}
target = 3

Output: 4

Explanation:
(-3, -1) → -4 < 3
(-3, 2)  → -1 < 3
(-3, 4)  → 1 < 3
(-1, 2)  → 1 < 3 */

public class ProblemY {

    public static int countPairs(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                count = count + (right - left);
                left++;
            } else {
                right--;
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

