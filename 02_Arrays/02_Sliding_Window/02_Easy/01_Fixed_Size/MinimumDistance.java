/*
Problem M — Minimum Distance From Target
Easy · Fixed-Size Sliding Window · Arrays Only

Java file: MinimumDistance.java

1. Problem statement
Given an integer array arr, a fixed window size k, and a target value, find the window sum that is closest to the target.

You must use the fixed-size sliding-window technique.

If two window sums are equally close to the target, return the smaller window sum.

2. Example
int arr[] = {3, 7, 2, 5, 1, 8};
int k = 3;
int target = 15;

Expected output:

14
3. Understand the problem
Window.          Sum.        Distance from 15.

[3, 7, 2]       12              3

[7, 2, 5]       14              1

[2, 5, 1]       8               7

[5, 1, 8]       14              1

The closest window sum is 14, because its distance from 15 is only 1.

The distance is calculated using:

distance=∣windowSum−target∣ */
public class MinimumDistance {
    public static void main(String[] args) {
        int arr[] = {3, 7, 2, 5, 1, 8};
        int k = 3;
        int windowSum = 0;
        int target = 15;

        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        int MinimumDistance = Math.abs(windowSum - target);
        int closestSum = windowSum;

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            int distance = Math.abs(windowSum - target);

            if(distance < MinimumDistance || (distance == MinimumDistance && windowSum <  closestSum)){
                MinimumDistance = distance;
                closestSum = windowSum;
            }
        }
        System.out.println("Closest Window Sum: "+ closestSum);
        System.out.println("Minimum Distance: "+ MinimumDistance);
    }
}
