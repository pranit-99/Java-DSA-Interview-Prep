/*Problem 3 — Fixed Sliding Window: Count Windows with Sum ≥ Target
Given an array, window size k, and target, find how many subarrays of size k have a sum greater than or equal to the target.
Input
int[] arr = {2, 4, 1, 6, 3, 2};
int k = 3;
int target = 9;

Expected Output
3

Windows:
[2, 4, 1] → 7   ❌
[4, 1, 6] → 11  ✅
[1, 6, 3] → 10  ✅
[6, 3, 2] → 11  ✅

Count = 3 */
public class CountWindows {
    public static int countWindows(int arr[], int k, int target){
        int windowSum  = 0;
        //First Window

        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        int count = 0;
        if(windowSum >= target){
            count++;
        }

        //Slide the Window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            if(windowSum >= target){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr = {2, 4, 1, 6, 3, 2};
        int k = 3;
        int target = 9;

        System.out.println("Count: " + countWindows(arr, k, target));
    }
}
