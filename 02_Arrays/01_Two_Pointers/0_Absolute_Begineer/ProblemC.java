/*Problem C: Count Equal Pairs from Opposite Ends
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs of elements at opposite positions have equal values.
Each pair should be counted only once.
Example 1
Input:  arr = {1, 2, 3, 2, 1}
Output: 2

Explanation:
(1, 1) → Equal
(2, 2) → Equal
Middle element 3 is ignored.


Example 2
Input:  arr = {1, 2, 3, 4, 5, 6}
Output: 0


Example 3
Input:  arr = {5, 3, 7, 7, 3, 5}
Output: 3 */
public class ProblemC {
    public static int CountEqualPair(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] == arr[right]){
                count = count + 1;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        System.out.println("Output:-" + CountEqualPair(arr));
    }
}
