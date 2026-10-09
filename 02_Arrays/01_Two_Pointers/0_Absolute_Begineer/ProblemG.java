/*Problem G: Count Pairs Whose Sum Is Greater Than Target
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array and a target value, count how many pairs at opposite positions have a sum strictly greater than the target.
Compare the first element with the last, the second with the second-last, and so on.
Ignore the middle element if the array length is odd. 
Example 1
Input:
arr = {4, 7, 2, 5, 8}
target = 10

Output: 2

Explanation:
(4, 8) → 12 > 10 → Count
(7, 5) → 12 > 10 → Count


Example 2
Input:
arr = {1, 2, 3, 4, 5, 6}
target = 10

Output: 0


Example 3
Input:
arr = {9, 3, 6, 2, 7, 5}
target = 10

Output: 2

Explanation:
(9, 5) → 14 > 10 → Count
(3, 7) → 10 > 10 → Do not count
(6, 2) → 8 > 10 → Do not count*/
public class ProblemG {
    public static int countPairs(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
          if(arr[left] + arr[right] > target){
            count++;
          }
          left++;
          right--;  
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 7, 2, 5, 8};
        int target = 10;
        System.out.println("Output:-" + countPairs(arr, target));
    }
}
