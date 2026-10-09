/*Problem M: Count Pairs Where the Left Element Is Twice the Right Element
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions satisfy the condition:
arr[left] == 2 * arr[right]
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd. 
Example 1
Input:
arr = {8, 6, 4, 3, 4}

Output: 2

Explanation:
(8, 4) → 8 == 2 * 4 → Count
(6, 3) → 6 == 2 * 3 → Count


Example 2
Input:
arr = {2, 4, 6, 8, 10, 12}

Output: 0

Explanation:
(2, 12) → Not equal
(4, 10) → Not equal
(6, 8) → Not equal


Example 3
Input:
arr = {10, 3, 5, 2, 6, 5}

Output: 1

Explanation:
(10, 5) → 10 == 2 * 5 → Count
(3, 6) → Not equal
(5, 2) → Not equal*/
public class ProblemM {
    public static int CountPairs(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] == 2 * arr[right]){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4, 8, 6, 4, 3, 4, 2};
        System.out.println(CountPairs(arr));
    }
}
