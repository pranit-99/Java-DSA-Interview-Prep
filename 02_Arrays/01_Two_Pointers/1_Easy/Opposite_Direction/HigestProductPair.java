/*Problem 9 (H): Highest Product Pair
Easy
 Opposite-Direction Two Pointers
 Independent Practice

Java Filename: HighestProductPair.java
Pointer Movement: Compare elements at opposite ends of a sorted array.
Problem Statement
Given a sorted integer array containing both positive and negative numbers, find the maximum product of any two distinct elements.
Return the maximum product as an integer.
You must use the Opposite-Direction Two Pointers technique.
Example 1
Input:
arr = new int[]{-10, -8, -3, 1, 5, 7};


Output:
80


Explanation: (-10) × (-8) = 80, which is greater than 5 × 7 = 35.
Example 2
Input:
arr = new int[]{-5, -2, 0, 3, 9};


Output:
27


Explanation: 3 × 9 = 27.
Example 3
Input:
arr = new int[]{-7, -4, -2, -1};


Output:
28


Explanation: (-7) × (-4) = 28.
Constraints
- 2 <= arr.length <= 1000
- -1000 <= arr[i] <= 1000
- The array is already sorted in ascending order.
- Do not use nested loops.
- Do not use Arrays.sort().
- Expected time complexity: O(n) or better.
- Expected auxiliary space complexity: O(1). */
public class HigestProductPair {
    public static int higestProductPair(int arr[]){
        int left = 0;
        int right = arr.length-1;

        int leftproduct = arr[left] * arr[left + 1];
        int rightProduct = arr[right] * arr[right - 1];

        int maxProduct = Math.max(leftproduct, rightProduct);
        return maxProduct;
    }
    public static void main(String[] args) {
        int arr[] = {-10, -8, -3, 1, 5, 7};
        System.out.println(higestProductPair(arr));
    }
}
