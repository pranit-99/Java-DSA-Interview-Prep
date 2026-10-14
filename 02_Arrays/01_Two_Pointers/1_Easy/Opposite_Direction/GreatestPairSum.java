/*Problem 8 (G): Greatest Pair Sum Under Target
Easy
 Independent Practice 3 of 10

Java Filename: GreatestPairSumUnderTarget.java
Pattern: Arrays — Opposite-Direction Two Pointers
Pointer Movement: Conditional
Problem Statement
Given a sorted integer array and an integer target, find the greatest possible sum of two distinct elements that is strictly less than the target.
Return the greatest valid pair sum. If no such pair exists, return -1.
You must solve this using the Opposite-Direction Two Pointers technique.
Example 1
Input:
arr = new int[]{1, 2, 3, 4, 6, 8};
target = 10;


Output:
9


Explanation: The pair (1, 8) gives 9, which is the greatest pair sum strictly less than 10.
Example 2
Input:
arr = new int[]{2, 4, 5, 7, 9};
target = 12;


Output:
11


Explanation: The pair (2, 9) gives 11.
Example 3
Input:
arr = new int[]{5, 7, 9, 11};
target = 10;


Output:
-1


Explanation: No pair has a sum strictly less than 10.
Constraints
- 2 <= arr.length <= 1000
- 0 <= arr[i] <= 1000
- 0 <= target <= 2000
- The array is sorted in ascending order.
- Do not use nested loops or Arrays.sort().
- Expected time complexity: O(n).
- Expected auxiliary space complexity: O(1). */
public class GreatestPairSum {
    public static int greatestPairSum(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        int maxSum = -1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum < target){
                if(sum > maxSum){
                    maxSum = sum;
                }
                left++;
            }else{
                right--;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 8};
        int target = 10;
        System.out.println("Greatest Pair Sum: "+ greatestPairSum(arr, target));
    }
}
