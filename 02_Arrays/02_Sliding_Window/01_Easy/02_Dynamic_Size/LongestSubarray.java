/*Dynamic Sliding Window — Problem 2
Longest Subarray with Sum ≤ Target
Given an array of positive integers and a target, find the length of the longest contiguous subarray whose sum is less than or equal to the target.
Input
int[] arr = {2, 1, 3, 2, 1, 1, 1};
int target = 6;

Expected Output
4

For example:
[2, 1, 3]       → sum = 6 → length 3
[1, 3, 2]       → sum = 6 → length 3
[2, 1, 1, 1]    → sum = 5 → length 4 ✅

Longest length = 4

What is our condition?
We are allowed:
windowSum <= target

If the sum becomes too large:
windowSum > target

we shrink from the left. */
public class LongestSubarray {
    public static int findLongestLength(int arr[], int target){
        int left = 0;
        int windowSum = 0;
        int maxLength = 0;

        for(int right = 0; right < arr.length; right++){
            // Expand the window
            windowSum = windowSum + arr[right];

            //Shrink if sum becomes too lrge
            while(windowSum > target){
                windowSum = windowSum - arr[left];
                left++;
            }

            //Current window is valid
            int currentLength = right - left + 1;

            if(currentLength > maxLength){
                maxLength = currentLength;
            }


        }
        return maxLength;
    }
    public static void main(String[] args) {
        
    }
}
