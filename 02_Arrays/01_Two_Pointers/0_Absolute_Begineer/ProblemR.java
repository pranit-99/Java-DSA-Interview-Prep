/*Problem R: Count Opposite-End Pairs Whose Sum Is Divisible by 3
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions have a sum divisible by 3.
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:
arr = {2, 4, 5, 7, 8, 1}

Output: 2

Explanation:
(2, 1) → Sum = 3  → Count
(4, 8) → Sum = 12 → Count
(5, 7) → Sum = 12 → Count


Correct output: 3
Example 2
Input:
arr = {1, 2, 4, 5}

Output: 2

Explanation:
(1, 5) → Sum = 6 → Count
(2, 4) → Sum = 6 → Count


Example 3
Input:
arr = {2, 5, 7, 4, 8, 3}

Output: 0

Explanation:
(2, 3) → Sum = 5  → Do not count
(5, 8) → Sum = 13 → Do not count
(7, 4) → Sum = 11 → Do not count */
public class ProblemR {
    public static int countPairs(int arr[]){
        int left  = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if((arr[left] + arr[right]) % 3 == 0 ){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 1};
        System.out.println(countPairs(arr));
    }
}
