/*Problem 5 (D): Determine If Array Has a Pair With Given Sum
Easy
 Opposite-Direction Two Pointers

Java Filename: DeterminePairSum.java
Pointer Movement: Conditional (left++ or right--)
Problem Statement
Given a sorted integer array and a target sum, determine whether any two distinct elements add up to the target.
Return true if a valid pair exists; otherwise, return false.
You must use the Opposite-Direction Two Pointers technique.
Example 1
Input:
arr = {1, 2, 4, 6, 8, 10}
target = 14

Output: true

Explanation:
4 + 10 = 14
6 + 8 = 14


Example 2
Input:
arr = {2, 3, 5, 7, 9}
target = 20

Output: false */
public class DeterminePairSum {
    public static boolean hasPairSum(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return true;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]  = {1, 2, 4, 6, 8, 10};
        int target = 14;
        System.out.println("Pair Found: " + hasPairSum(arr, target));
    }
}

