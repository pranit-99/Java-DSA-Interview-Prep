/*Problem E: Count Pairs Where Left Element Is Greater Than Right
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs of elements at opposite positions satisfy the condition:
arr[left] > arr[right]
Each pair should be counted only once. Ignore the middle element if the array length is odd. 
Example 1
Input:  arr = {9, 7, 3, 4, 2}
Output: 2

Explanation:
(9, 2) → 9 > 2 → Count
(7, 4) → 7 > 4 → Count


Example 2
Input:  arr = {1, 2, 3, 4, 5}
Output: 0


Example 3
Input:  arr = {8, 3, 6, 2, 5, 4}
Output: 2

Explanation:
(8, 4) → Count
(3, 5) → Do not count
(6, 2) → Count*/
public class ProblemE {
    public static int CountPairs(int arr[]){
        int left = 0;
        int right = arr.length -1;
        int count = 0;

        while(left < right){
            if(arr[left] > arr[right]){
                count = count + 1;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {9, 7, 8, 6, 3, 1, 4, 2};
        System.out.println("Output:-" + CountPairs(arr));
    }
}
