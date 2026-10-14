/*Problem 10 (I): Increasing Pair Sum Closest to Target
Easy
 Opposite-Direction Two Pointers
 Independent Practice

Java Filename: IncreasingPairSumClosestToTarget.java
Pointer Movement: Conditional (left++ or right--)
Problem Statement
Given a sorted integer array and an integer target, find the sum of two distinct elements that is closest to the target.
Return the closest pair sum, not the pair itself.
If two sums are equally close to the target, return the smaller sum.
You must use the Opposite-Direction Two Pointers technique.
Example 1
Input:
arr = new int[]{1, 3, 5, 8, 12};
target = 10;


Output:
9


Explanation: 1 + 8 = 9, which is 1 away from the target. 3 + 8 = 11 is also 1 away, so return the smaller sum, 9.
Example 2
Input:
arr = new int[]{-8, -3, 1, 4, 9};
target = 7;


Output:
6


Explanation: -3 + 9 = 6, which is closest to 7.
Example 3
Input:
arr = new int[]{2, 4, 6, 8};
target = 10;


Output:
10


Explanation: Both (2, 8) and (4, 6) give an exact sum of 10.
Constraints
- 2 <= arr.length <= 1000
- -1000 <= arr[i] <= 1000
- -2000 <= target <= 2000
- The array is already sorted in ascending order.
- Do not use nested loops.
- Do not use Arrays.sort().
- Expected time complexity: O(n).
- Expected auxiliary space complexity: O(1). */
public class IncreasingPairSum {
    public static int closestPairSum(int arr[], int target){
        int left  = 0;
        int right = arr.length - 1;

        int closestSum = arr[left] + arr[right];

        while(left < right){
            int sum = arr[left] + arr[right];
            int currentDifference = Math.abs(target - sum);
            int bestDifference = Math.abs(target - closestSum);

            if(currentDifference < bestDifference){
                closestSum = sum;
            }else if(currentDifference == bestDifference && sum < closestSum){
                closestSum = sum;
            }
            
            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                return sum;
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 12};
        int target = 10;
        System.out.println("Closest Pair Sum:" + closestPairSum(arr, target));
    }
}
