/* Given a sorted array of non-negative integers and a target, find the largest pair sum that is less than or equal to the target.
For example:
Input:
arr = {1, 3, 5, 8, 12}
target = 14

Output: 13

Explanation:
1 + 12 = 13
5 + 8 = 13


This is a valid opposite-direction two-pointer problem.
4. Think about the pointer movement
- If sum <= target, the pair is valid. Save it if it's the best answer, then move left++ to search for a larger sum.
- If sum > target, move right-- to reduce the sum.*/
public class LargestValidPairSum {
   public static int largestPairSum(int arr[], int target){
    int left = 0;
    int right = arr.length - 1;
    int maxSum = -1;

    while(left < right){
        int sum = arr[left] + arr[right];

        if(sum <= target){
            if(sum > maxSum){
                maxSum = sum;
            }
            left++;
        }else{
            right--;
        }
    }
    return maxSum;
   }
   public static void main(String[] args) {
       int arr[] = {1, 3, 5, 8, 12};
       int target = 14;
       System.out.println(largestPairSum(arr, target));
    } 
}
