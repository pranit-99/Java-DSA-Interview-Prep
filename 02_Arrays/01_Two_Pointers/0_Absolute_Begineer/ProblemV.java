/*Problem V: Find the First Equal Pair Using Conditional Pointer Movement
Absolute Beginner
 Opposite Direction – Conditional Pointer Movement

Problem Statement
Given an integer array, find the first pair of equal elements using two pointers starting from opposite ends.
Follow these rules:
- If arr[left] == arr[right], return true.
- If arr[left] < arr[right], move the left pointer forward.
- If arr[left] > arr[right], move the right pointer backward.
- If the pointers meet without finding an equal pair, return false.
Example 1
Input:
arr = {2, 5, 8, 3, 5}

Output: true

Explanation:
(2, 5) → Left moves
(5, 5) → Equal pair found


Example 2
Input:
arr = {1, 3, 5, 7, 9}

Output: false


Example 3
Input:
arr = {8, 4, 6, 2, 8}

Output: true

Explanation:
(8, 8) → Equal pair found */
public class ProblemV {
    public static boolean EqualPairs(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] == arr[right]){
                System.out.println( "Found Equal Pair " + arr[left] + " and " + arr[right]);
                return true;
            }else if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 3, 5};
        System.out.println("Output:-" +EqualPairs(arr));
    }
}
