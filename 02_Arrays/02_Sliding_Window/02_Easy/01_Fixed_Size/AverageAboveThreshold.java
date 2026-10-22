/*Problem A — Average Above Threshold
Easy
Fixed-Size Sliding Window

ProblemA.java

1. Problem Statement
Given an integer array arr, an integer k, and a threshold, count the number of contiguous subarrays of exactly size k whose average is greater than or equal to the threshold.
Example
int[] arr = {2, 5, 1, 8, 2, 9};
int k = 3;
int threshold = 4;


Expected Output:
3


Explanation
Window	Sum	Average	Valid?
[2, 5, 1]	8	2.67	No
[5, 1, 8]	14	4.67	Yes
[1, 8, 2]	11	3.67	No
[8, 2, 9]	19	6.33	Yes
Correction: The correct expected output for this example is 2, not 3, because only two windows meet the threshold.
2. Think Before Coding
We already know how to calculate the sum of a fixed-size window.

Now the challenge is to apply an additional condition.

Remember:
\[
\text{Average}=\frac{\text{Window Sum}}{k}
\]

Instead of dividing every time, we can compare:
\[
\text{Window Sum}\geq k\times\text{threshold}
\]

This avoids unnecessary division and floating-point calculations.
3. Your Task
Write a Java program using the fixed-size sliding-window technique.
- Calculate the sum of the first window.
- Check whether its average meets the threshold.
- Slide the window by removing the outgoing element and adding the incoming element.
- Count every qualifying window.
- Print the final count.
Constraints:
- 1 <= k <= arr.length
- Array elements are non-negative integers.
- Do not use nested loops to recalculate each window's sum.
4. Additional Test Cases
Test Case 1

arr = {t.arr}, k = {t.k}, threshold = {t.t}

Test Case 2

arr = {t.arr}, k = {t.k}, threshold = {t.t}

Test Case 3

arr = {t.arr}, k = {t.k}, threshold = {t.t}

Reveal expected outputs
5. One Question Before You Start
Suppose:
int[] arr = {2, 5, 1, 8, 2, 9};
int k = 3;
int threshold = 4;


The first window sum is 8.

Which condition would you use to check whether the window qualifies?

windowSum >= threshold


windowSum >= k * threshold


windowSum == threshold */
public class AverageAboveThreshold {
    public static void main(String[] args) {
      int arr[] = {2, 5, 1, 8, 2, 9};
      int k = 3;
      int threshold = 4;
      
      int windowSum = 0;
      int count = 0;

      //Step 1. Calculate first window sum
      for(int i = 0; i < k; i++){
        windowSum += arr[i];
      }

      if(windowSum >= threshold * k){
        count++;
      }

      //Step 3: Slide the window
      for(int i = k; i < arr.length; i++){
        windowSum = windowSum - arr[i - k] + arr[i];

        //Step 4:- check current window
        if(windowSum >= threshold * k){
            count++;
        }
      }
      System.out.println("Count: "+ count);
    }
}
