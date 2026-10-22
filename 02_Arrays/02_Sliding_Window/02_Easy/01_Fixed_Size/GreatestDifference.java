/*Problem G — Greatest Difference Between Window Sums
Easy
Fixed-Size Sliding Window

GreatestDifference.java

1. Problem Statement
Given an integer array arr and an integer k, find the greatest absolute difference between the sums of two consecutive windows of size k.

You must solve this using the fixed-size sliding-window technique.
Example
int arr[] = {2, 5, 1, 8, 3, 7};
int k = 3;


Expected output:
7


2. Understand the problem
First, calculate the sum of each window.
Window	Sum	Difference from previous window
[2, 5, 1]	8	—
[5, 1, 8]	14	6
[1, 8, 3]	12	2
[8, 3, 7]	18	6
For this input, the correct expected output is 6, not 7.

We use the absolute difference because we only care about the size of the difference, regardless of whether the sum increased or decreased.
3. Pattern Recognition — Think before coding
Ask yourself three questions:

1. Is the window size fixed?

Yes. Each window contains exactly k elements.

2. What information do we need to maintain?

We need three variables:
- currentWindowSum — sum of the current window.
- previousWindowSum — sum of the previous window.
- maxDifference — greatest absolute difference found so far. */
public class GreatestDifference {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 3, 7};
        int k = 3;
        int Difference = 0;
        int maxDifference = 0;
        int windowSum = 0;
        int previousWindowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        System.err.println("Sum:-" +windowSum + " Difference:- __" );
        previousWindowSum = windowSum;
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[ i - k] + arr[i];
            Difference = Math.abs(windowSum - previousWindowSum);
            maxDifference = Math.max(maxDifference, Difference);
            System.out.println("Sum:-" +windowSum + " Difference: " + (windowSum - previousWindowSum));
            previousWindowSum = windowSum;
        }
        System.out.println("Greatest Difference: " + maxDifference);
    }
}
