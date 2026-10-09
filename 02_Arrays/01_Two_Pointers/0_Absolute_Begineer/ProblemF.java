/*Problem F: Count Pairs Whose Sum Is Even
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs of elements at opposite positions have an even sum.
Each pair should be counted only once. Ignore the middle element if the array length is odd. 
Example 1
Input:  arr = {2, 4, 5, 6, 8}
Output: 2

Explanation:
(2, 8) → 10 → Even
(4, 6) → 10 → Even


Example 2
Input:  arr = {1, 2, 3, 4, 5, 6}
Output: 0

Explanation:
(1, 6) → 7 → Odd
(2, 5) → 7 → Odd
(3, 4) → 7 → Odd


Example 3
Input:  arr = {3, 5, 7, 9}
Output: 2

Explanation:
(3, 9) → 12 → Even
(5, 7) → 12 → Even*/
public class ProblemF {
    public static int countPairs(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
       

        while(left < right){
          if((arr[left] + arr[right]) % 2 == 0){
            count++;
          }
          left++;
          right--;  
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Output:-" + countPairs(arr));
    }
}
