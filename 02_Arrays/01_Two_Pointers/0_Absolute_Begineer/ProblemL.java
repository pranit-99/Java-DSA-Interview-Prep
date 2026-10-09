/*Problem L: Find the Minimum Sum of Opposite-End Pairs
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, find the minimum sum among all pairs at opposite positions.
Compare the first element with the last, the second with the second-last, and so on.
Return the smallest pair sum.
Example 1
Input:
arr = {2, 5, 8, 3, 7, 4}

Output: 6

Explanation:
(2, 4) → Sum = 6
(5, 7) → Sum = 12
(8, 3) → Sum = 11

Minimum Sum = 6


Example 2
Input:
arr = {1, 3, 5, 7}

Output: 8

Explanation:
(1, 7) → Sum = 8
(3, 5) → Sum = 8

Minimum Sum = 8


Example 3
Input:
arr = {-8, -3, -5, -2}

Output: -10

Explanation:
(-8, -2) → Sum = -10
(-3, -5) → Sum = -8

Minimum Sum = -10 */
public class ProblemL {
    public static int Minimum(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum < min){
                min = sum;
            }
            left++;
            right--;
        }
        return min;

    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 3, 7, 4};
        System.out.println(Minimum(arr));
    }
}
