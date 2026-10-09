/*Problem D: Count Unequal Pairs from Opposite Ends
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs of elements at opposite positions have different values.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:  arr = {1, 2, 3, 4, 5}
Output: 2


Example 2
Input:  arr = {5, 3, 7, 7, 3, 5}
Output: 0


Example 3
Input:  arr = {1, 2, 3, 2, 9}
Output: 1 */
public class ProblemD {
    public static int countUnequalPairs(int arr[]){
        int left = 0;
        int right = arr.length -1;
        int count = 0;

        while(left < right){
            if(arr[left] != arr[right]){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Output:" + countUnequalPairs(arr));
    }
}
