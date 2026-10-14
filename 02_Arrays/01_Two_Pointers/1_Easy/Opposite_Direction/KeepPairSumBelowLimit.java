/*Problem 12 (K): Keep Pair Sum Below Limit
Easy
 Arrays
 Opposite-Direction Two Pointers

Java Filename: KeepPairSumBelowLimit.java
Pointer Movement: Conditional (left++ or right--)
1. Problem statement
Given a sorted integer array and an integer limit, count how many distinct index pairs have a sum strictly less than the limit.
Each pair must use two different indices, and every valid pair should be counted once.
Example 1
Input:
arr = {1, 2, 3, 4, 5}
limit = 6

Output: 4

Valid pairs:
(1, 2), (1, 3), (1, 4), (2, 3)


Example 2
Input:
arr = {2, 3, 4, 5}
limit = 8

Output: 4

Valid pairs:
(2, 3), (2, 4), (2, 5), (3, 4)


2. How should we approach this?
Let's start with:
arr = {1, 2, 3, 4, 5}
limit = 6 */
public class KeepPairSumBelowLimit {
    public static int countPairs(int arr[], int limit){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum < limit){
                count = count + (right - left);
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int limit = 6;

        System.out.println("Valid Pairs: "
                + countPairs(arr, limit));
    }
}
