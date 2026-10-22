/*Problem Q — Quotient Threshold Windows
Easy · Fixed-Size Sliding Window · Integer Division

Java file: QuotientThreshold.java
1. Problem statement
Given an integer array arr, a fixed window size k, and a threshold target, count how many windows have an integer quotient greater than the target.

The quotient is calculated as:
\[
quotient = windowSum / k
\]

Important: Use Java integer division, not decimal division.

A window is valid when:
windowSum / k > target


2. Example
int arr[] = {4, 7, 2, 9, 5, 8, 3};
int k = 3;
int target = 5;


Expected output:
3


3. Understand the example
Window	Sum	Integer quotient (sum / 3)	Greater than 5?
[4, 7, 2]	13	4	No
[7, 2, 9]	18	6	Yes
[2, 9, 5]	16	5	No
[9, 5, 8]	22	7	Yes
[5, 8, 3]	16	5	No
The correct expected output is 2, because two windows satisfy the condition. */
public class QuotientThresholdWindows {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 5, 8, 3};
        int k = 3;
        int target = 5;
        int count = 0;
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];

        }

        if(windowSum / k > target){
            count++;
        }

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            if(windowSum / k > target){
            count++;
        }
        }
        System.out.println(count);
    }

   
}
