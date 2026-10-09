/*Problem H: Count Pairs Whose Absolute Difference Is Greater Than Target
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array and a positive target value, count how many pairs at opposite positions have an absolute difference strictly greater than the target.
Compare the first element with the last, the second with the second-last, and so on. 
Example 1
Input:
arr = {2, 8, 4, 10, 15}
target = 5

Output: 2

Explanation:
(2, 15) → |2 - 15| = 13 → Count
(8, 10) → |8 - 10| = 2 → Do not count


Correction: The output for Example 1 is 1.
Example 2
Input:
arr = {5, 6, 7, 8}
target = 4

Output: 0


Example 3
Input:
arr = {10, 3, 6, 15, 1, 20}
target = 8

Output: 2

Explanation:
(10, 20) → Difference 10 → Count
(3, 1) → Difference 2 → Do not count
(6, 15) → Difference 9 → Count*/
public class ProblemH {
    public static int countPairs(int arr[], int target){
        int left  = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            int difference = Math.abs(arr[left] - arr[right]);
            if(difference > target){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]  = {10, 3, 6, 15, 1, 20};
        int target = 8;
        System.out.println("Output:-" +countPairs(arr, target));
    }
}
