/* Problem I: Count Pairs Where Both Elements Are Even
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions contain two even numbers.
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:
arr = {2, 3, 4, 7, 8, 6}

Output: 2

Explanation:
(2, 6) → Both even → Count
(3, 8) → Not both even
(4, 7) → Not both even


Correction: The output for Example 1 is 1.
Example 2
Input:
arr = {2, 4, 6, 8}

Output: 2

Explanation:
(2, 8) → Both even → Count
(4, 6) → Both even → Count


Example 3
Input:
arr = {1, 3, 5, 7, 9}

Output: 0*/
public class ProblemI {
    public static int countPairs(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] % 2 == 0 && arr[right] % 2 == 0){
                count++;
            }
            left++;
            right--;       
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 8, 6};
        System.out.println("Output:-" +countPairs(arr));
    }

}
