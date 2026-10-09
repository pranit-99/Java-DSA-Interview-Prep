/*Problem N: Count Pairs Where the Left Element Is Divisible by the Right Element
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions satisfy the condition that the left element is divisible by the right element.
A number is divisible by another number if the remainder is zero.
Each pair should be counted only once. Ignore the middle element if the array length is odd. 
Example 1
Input:
arr = {12, 15, 8, 4, 5, 3}

Output: 3

Explanation:
(12, 3) → 12 % 3 = 0 → Count
(15, 5) → 15 % 5 = 0 → Count
(8, 4) → 8 % 4 = 0 → Count


Example 2
Input:
arr = {7, 9, 11, 2, 4, 5}

Output: 0

Explanation:
(7, 5) → Not divisible
(9, 4) → Not divisible
(11, 2) → Not divisible


Example 3
Input:
arr = {10, 6, 9, 3, 4, 2}

Output: 2

Explanation:
(10, 2) → Divisible → Count
(6, 4) → Not divisible
(9, 3) → Divisible → Count*/
public class ProblemN {
    public static int countPairs(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] % arr[right] == 0){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {12, 15, 8, 4, 5, 3};
        System.out.println(countPairs(arr));
    }
}
