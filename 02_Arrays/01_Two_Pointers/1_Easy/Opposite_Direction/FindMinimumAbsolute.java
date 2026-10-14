
/*Problem 7 (F): Find Minimum Absolute Pair Sum
Easy
 Independent Practice 2 of 10

Java Filename: FindMinimumAbsolutePairSum.java
Pattern: Arrays — Opposite-Direction Two Pointers
Pointer Movement: Conditional
Problem Statement
Given a sorted integer array containing positive and negative numbers, find the minimum absolute sum of any two distinct elements.
The absolute sum of two elements is calculated as:
\[
|arr[i]+arr[j]|
\]

where i != j.
Return the minimum absolute sum as an integer.
Example 1
Input:
arr = new int[]{-8, -5, -2, 3, 7};


Output:
1


Explanation: Both (-8, 7) and (-2, 3) produce an absolute sum of 1.
Example 2
Input:
arr = new int[]{-10, -4, -1, 6, 9};


Output:
1


Explanation: -10 + 9 = -1, whose absolute value is 1.
Example 3
Input:
arr = new int[]{2, 4, 6, 8};


Output:
6 */
public class FindMinimumAbsolute {
    public static int findMinimumAbsolutePairSum(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;

        while(left < right){
            int sum = arr[left] + arr[right];
            int absoluteSum = Math.abs(sum);

             if(absoluteSum < minSum){
            minSum = absoluteSum;  
        }

        if(sum < 0){
            left++;
        }else if(sum > 0){
            right--;
        }else{
            return 0;
        }
        }
        return minSum;

    }
    public static void main(String[] args) {
        int arr[] = {-8, -5, -2, 3, 7};

        System.out.println(
            "Minimum Absolute Pair Sum: " + findMinimumAbsolutePairSum(arr)
        );
    }
}
