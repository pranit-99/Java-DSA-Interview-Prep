/*Problem 14 (M): Maximize Distance Between Valid Pair Indices
Easy practice
 Arrays
 Opposite-Direction Two Pointers

Java Filename: MaximizeValidPairDistance.java
Pointer Movement: Conditional (left++ or right--)
1. Problem statement
Given a sorted integer array and an integer target, find the maximum index distance between two distinct elements whose sum is less than or equal to the target.
The distance between two indices is:
\[
\text{distance}=j-i
\]

where i < j.
Return the maximum distance. If no valid pair exists, return -1.
Example 1
Input:
arr = {1, 2, 3, 4, 5, 6}
target = 7

Output: 5

Explanation:
arr[0] + arr[5] = 1 + 6 = 7
Distance = 5 - 0 = 5


Example 2
Input:
arr = {2, 4, 6, 8, 10}
target = 11

Output: 3

Explanation:
arr[0] + arr[3] = 2 + 8 = 10
Distance = 3 - 0 = 3


Example 3
Input:
arr = {5, 7, 9}
target = 10

Output: -1 */
public class MaximizeValidPairDistance {
    public static int maxDistance(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum <= target){
                return right - left; 
            }else{
                right--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int target = 11;

        System.out.println("Maximum Distance:" + maxDistance(arr, target));
    }
}
