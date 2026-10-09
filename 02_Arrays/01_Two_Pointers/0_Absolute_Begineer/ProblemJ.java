/*Problem J: Count Pairs Where Both Elements Are Odd
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array, count how many pairs at opposite positions contain two odd numbers.
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd. 
Example 1
Input:
arr = {3, 2, 5, 7, 4, 9}

Output: 2

Explanation:
(3, 9) → Both odd → Count
(2, 4) → Not both odd
(5, 7) → Both odd → Count


Example 2
Input:
arr = {1, 3, 5, 7}

Output: 2

Explanation:
(1, 7) → Both odd → Count
(3, 5) → Both odd → Count


Example 3
Input:
arr = {2, 4, 6, 8, 10}

Output: 0*/
public class ProblemJ {
    public static int countPairs(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 != 0){
                count++;
            }
            left++;
            right--;       
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 7, 4, 9};
        System.out.println("Output:-" +countPairs(arr));
    }

}
