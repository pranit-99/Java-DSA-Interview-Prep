/*Problem X: Find a Pair Whose Sum Is Closest to Zero
Easy
 Opposite Direction – Conditional Pointer Movement

Problem Statement
Given a sorted integer array containing positive and negative numbers, find two distinct elements whose sum is closest to zero.
Return the two elements.
If multiple pairs have sums equally close to zero, you may return any one of them.
Example 1
Input:
arr = {-8, -5, -2, 3, 7}

Output: {-2, 3}

Explanation:
-2 + 3 = 1
Absolute difference from zero = 1


Example 2
Input:
arr = {-10, -4, -1, 2, 6}

Output: {-1, 2}

Explanation:
-1 + 2 = 1
Absolute difference from zero = 1


Example 3
Input:
arr = {-6, -3, 1, 4, 8}

Output: {-3, 4}

Explanation:
-3 + 4 = 1
Absolute difference from zero = 1


Constraints
- 2 <= arr.length <= 100
- -100 <= arr[i] <= 100
- The array is sorted in ascending order.
- Use opposite-direction left and right pointers.
- Use O(1) extra space.
- Do not use nested loops.
Your Task: Write a Java program to find the pair whose sum is closest to zero.
Send me your solution, and I'll review it before we proceed to Problem Y. */
public class ProblemX {
   public static void closestToZero(int arr[]){
    int left = 0;
    int right = arr.length - 1;

    int minDifference = Integer.MAX_VALUE;
    int first = 0;
    int second = 0;

    while(left < right){
        int sum = arr[left] + arr[right];
        int difference = Math.abs(sum);

        if(difference < minDifference){
            minDifference = difference;
            first = arr[left];
            second = arr[right];
        }

        if(sum < 0){
            left++;
        }else if(sum > 0){
            right--;
        }else{
            break;
        }
    }
    System.out.println("Closest Pair: " + first + ", " + second);
    }
   
   public static void main(String args[]){
    int arr[] = {-8, -5, -2, 3, 7};
    closestToZero(arr);
   } 
}
