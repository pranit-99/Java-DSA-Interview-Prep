/*Problem 4 — Closest Pair to Target
Type: Pair Sum / Sorted Array — Two Pointers
Problem Statement
Given a sorted array and a target, find the pair whose sum is closest to the target.
arr = {1, 3, 4, 7, 10}
target = 15

Output:
Closest Pair: 4, 10

Here:
4 + 10 = 14
Difference from target = 1 */
public class ClosestPair {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 7, 10};
        int target = 15;

        int left = 0;
        int right = arr.length - 1;

        int minDifference = Integer.MAX_VALUE;

        int first = 0;
        int second = 0;

        while(left < right){
            int sum = arr[left] + arr[right];
            int difference = Math.abs(target - sum);

            if(difference < minDifference){
                minDifference = difference;
                first = arr[left];
                second = arr[right];
            }
            if(sum < target){
            left++;
            }else{
            right--;
            }
        }
    System.out.println("Closest Pair: " + first + ", " + second);
    }
}
