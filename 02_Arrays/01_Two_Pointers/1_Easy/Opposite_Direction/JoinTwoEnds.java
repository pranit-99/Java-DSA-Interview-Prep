/*Join Two Ends to Minimize Maximum Pair Sum
Easy practice
 Arrays
 Opposite-Direction Two Pointers

Java Filename: JoinTwoEndsMinMaxPairSum.java
1. Problem statement
You are given a sorted integer array containing an even number of elements.
Your task is to divide all elements into pairs so that:
- Every element belongs to exactly one pair.
- The largest pair sum among all pairs is as small as possible.
Return that minimum possible maximum pair sum.
Example 1
Input:
arr = {1, 2, 3, 4, 5, 6}

Output:
7

Explanation:
(1, 6) = 7
(2, 5) = 7
(3, 4) = 7

Maximum pair sum = 7


Example 2
Input:
arr = {1, 3, 4, 8}

Output:
9

Explanation:
(1, 8) = 9
(3, 4) = 7

Maximum pair sum = 9 */
public class JoinTwoEnds {
    public static int minimizeMaxPairSum(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int maxSum = Integer.MIN_VALUE;

        while(left < right){
            int pairSum = arr[left] + arr[right];

            if(pairSum > maxSum){
                maxSum = pairSum;
            }
            left++;
            right--;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Minimum Maximum Pair Sum: "+ minimizeMaxPairSum(arr));
    }
}
