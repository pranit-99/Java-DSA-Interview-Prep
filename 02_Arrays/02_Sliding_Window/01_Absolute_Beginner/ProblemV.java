/*Problem V — Verify Subarray With Exact Sum
Filename: V_VerifySubarrayWithExactSum.java
Input:
int[] arr = {2, 1, 5, 2, 3, 2};
int target = 8;


Expected output: true
Thinking approach
We want to find any contiguous subarray whose sum is exactly 8.
Because every element is positive:
1. Expand the window by adding arr[right].
2. If sum > target, shrink the window from the left.
3. If sum == target, we've found our answer.
4. If the entire array is processed without a match, return false.
We use while, not if, because removing just one element might not reduce the sum enough. */
public class ProblemV {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 2, 3, 2};
        int target = 8;

        int left = 0;
        int sum = 0;
        boolean found = false;

        for(int right = 0; right < arr.length; right++){
            sum = sum + arr[right];

            while(sum > target){
                sum = sum - arr[left];
                left++;
            }

            if(sum == target){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
