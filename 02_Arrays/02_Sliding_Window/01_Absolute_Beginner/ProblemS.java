/*Problem S — Smallest Subarray With Sum At Least Target
Guided Solution 1 of 3
Java filename: S_SmallestSubarray.java
Problem Statement
Given an array of positive integers and a target, find the minimum length of a contiguous subarray whose sum is greater than or equal to the target.
Input:
int[] arr = {2, 3, 1, 2, 4, 3};
int target = 7;


Expected output:
Minimum Length: 2 */
public class ProblemS {
   public static void main(String[] args) {
       int arr[] = {2, 3, 1, 2, 4, 3};
       int target = 7;

       int left = 0;
       int sum = 0;
       int minLength = Integer.MAX_VALUE;

       for(int right = 0; right < arr.length; right++){
        //Expand window
        sum = sum + arr[right];

        while(sum >= target){
            int length = right - left + 1;
            minLength = Math.min(minLength, length);
            sum = sum - arr[left];
            left++;
        }
       }
       if(minLength == Integer.MAX_VALUE){
        System.out.println("No Valid sub Array");
       }else{
        System.err.println("Minimum Length: " + minLength);
       }
   } 
}
