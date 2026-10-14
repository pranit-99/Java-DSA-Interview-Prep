

/*Number of Pairs With Exact Difference
Easy practice
 Arrays
 Opposite-Direction Two Pointers

Java Filename: NumberOfPairsWithExactDifference.java
1. Problem statement
Given a sorted integer array and a non-negative integer target, count the number of distinct index pairs (i, j) such that:
\[
|arr[i]-arr[j]|=target
\]

where i < j.
If duplicate values occur at different indices, count each valid index pair separately.
Example 1
Input:
arr = {1, 2, 3, 4, 5}
target = 2

Output: 3

Valid pairs:
(1, 3), (2, 4), (3, 5)


Example 2
Input:
arr = {1, 1, 3, 3}
target = 2

Output: 4

Valid index pairs:
(0, 2), (0, 3), (1, 2), (1, 3)


Example 3
Input:
arr = {2, 4, 6, 8}
target = 10

Output: 0 */
public class NumberOfPairsExactDiff {
    public static int countPairs(int arr[], int target){
        int count = 0;

        for(int left = 0; left < arr.length; left++){
            int right = left + 1;

            while(right < arr.length){
                int difference = arr[right] - arr[left];

                if(difference == target){
                    count++;
                }else if(difference > target){
                    break;
                }
                right++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int target = 2;
        System.out.println("Valid Pairs:" +countPairs(arr, target));
    }
}
