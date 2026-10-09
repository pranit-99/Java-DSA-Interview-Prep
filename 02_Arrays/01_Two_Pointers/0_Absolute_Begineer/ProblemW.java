

/*Problem W: Find a Pair Whose Sum Equals the Target
Easy
 Opposite Direction – Conditional Pointer Movement

Problem Statement
Given a sorted integer array and a target value, determine whether two distinct elements have a sum equal to the target.
Return true if a pair exists; otherwise, return false.
Example 1
Input:
arr = {1, 2, 4, 6, 8}
target = 10

Output: true

Explanation:
2 + 8 = 10


Example 2
Input:
arr = {1, 3, 5, 7, 9}
target = 8

Output: true

Explanation:
1 + 7 = 8


Example 3
Input:
arr = {2, 4, 6, 8}
target = 15

Output: false


Constraints
- 2 <= arr.length <= 100
- -100 <= arr[i] <= 100
- The array is sorted in ascending order.
- Use opposite-direction two pointers.
- Use O(1) extra space.
- Do not use nested loops. */
public class ProblemW {
    public static void equalsToTarget(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] + arr[right] == target){
                System.out.println("Pair for Target is" + arr[left] + "+" + arr[right] + "=" + (arr[left] + arr[right]));
                left++;
                right--;
            }else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 8};
        int target = 10;
        equalsToTarget(arr, target);
    }
}
