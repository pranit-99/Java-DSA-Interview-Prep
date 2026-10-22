/*Next — Problem M: Measure Sum of Every Pair
Absolute Beginner
Java filename: M_MeasureSumOfEveryPair.java
Problem Statement
Given an integer array, calculate and print the sum of every pair of consecutive elements.
This is a fixed-size sliding window problem where k = 2.
Input:
int[] arr = {3, 5, 2, 7, 4, 6};
int k = 2;


Expected output:
8
7
9
11
10


Your Task
Use the same fixed-size sliding window technique:
1. Calculate the sum of the first two elements.
2. Print the first window sum.
3. Slide the window one position to the right.
4. Update the sum without recalculating both elements.
5. Print every new window sum.
Target complexity: O(n) time and O(1) extra space. */
public class ProblemM {
    public static void main(String args[]){
        int arr[] = {3, 5, 2, 7, 4, 6};
        int k = 2;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            System.out.println(sum);
        }
    }

}
