/*Problem P: Count Opposite-End Pairs with a Negative Product
Absolute Beginner
 Two Pointers – Opposite Direction

Problem Statement
Given an integer array containing positive, negative, and zero values, count how many pairs at opposite positions have a product strictly less than zero.
Compare the first element with the last, the second with the second-last, and so on.
Each pair should be counted only once. Ignore the middle element if the array length is odd.
Example 1
Input:
arr = {2, -3, 4, -5, 6, -7}

Output: 3

Explanation:
(2, -7)  → -14 → Count
(-3, 6)  → -18 → Count
(4, -5)  → -20 → Count


Example 2
Input:
arr = {2, 4, 6, 8}

Output: 0

Explanation:
(2, 8) → 16 → Do not count
(4, 6) → 24 → Do not count


Example 3
Input:
arr = {-5, 0, 6, -2, 0, 3}

Output: 2

Explanation:
(-5, 3) → -15 → Count
(0, 0)  → 0   → Do not count
(6, -2) → -12 → Count */
public class ProblemP {
    public static int countPairs(int arr[]){
        int left = 0;
        int right  = arr.length - 1;
        int count = 0;

        while(left < right){
            if(arr[left] * arr[right] < 0){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, -3, 4, -5, 6, -7};
        System.out.println(countPairs(arr));
    }
}
