/*Problem L — Locate First Window With Target Sum
Absolute Beginner
Fixed-Size Sliding Window

We have completed the guided solutions for variable-size Sliding Window problems S, T, and U.
Now we'll resume our independent practice from Problem L, continuing through Problem R, one problem at a time.
1. Problem Statement
Given an integer array arr, a window size k, and a target sum, find the starting index of the first contiguous window of size k whose sum equals the target.
If no such window exists, return -1.
Java filename: L_LocateFirstWindowWithTargetSum.java
2. Example
Input:
int[] arr = {2, 4, 1, 5, 3, 2, 6};
int k = 3;
int target = 9;


Expected output:
Starting Index: 2 */
public class ProblemL {
    public static void main(String args[]){
        int arr[] = {2, 4, 1, 5, 3, 2, 6};
        int k = 3;
        int target = 9;
        int sum = 0;
        int i;

        //Create Window
        for(i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        if(sum == target){
            System.out.println("Starting Index:- 0");
            return;
        }

        //Slide the window
       for(i = k; i < arr.length; i++){
        sum = sum - arr[i - k] + arr[i];
        if(sum == target){
           System.out.println("Starting Index:-" + (i - k +1));
           return;
        }
       }
        System.out.println("Starting Index:-1");

    }
}
