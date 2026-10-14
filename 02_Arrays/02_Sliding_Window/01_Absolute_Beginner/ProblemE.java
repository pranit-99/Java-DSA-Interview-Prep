/*Problem E — Evaluate Average of Each Window
Absolute Beginner
Fixed-Size Sliding Window

1. Problem Statement
Given an integer array arr and an integer k, calculate and print the average of every contiguous subarray (window) of size k.
Java filename: E_EvaluateAverage.java
2. Example
Input:
int[] arr = {2, 4, 6, 8, 10, 12};
int k = 3;


Expected Output:
4.0
6.0
8.0
10.0

Calculate the first window sum.
 PreviousNext window 

4. Your Task
Write the Java program independently using these requirements:
1. Calculate the sum of the first k elements.
2. Calculate the average using windowSum / k.
3. Slide the window by removing the outgoing element and adding the incoming element.
4. Print the average of every window.
5. Use O(n) time and O(1) extra space. */
public class ProblemE {
    public static void main(String[] args) {
        int arr[]  = {2, 4, 6 ,8 ,10, 12};
        int k = 3;
        int sum = 0;
        
        //first window
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }

        System.out.println("Average:-" + (double)sum/k);

        //Slide the window
        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            System.out.println("Average:-" + (double)sum/k);
        }
    }
}
