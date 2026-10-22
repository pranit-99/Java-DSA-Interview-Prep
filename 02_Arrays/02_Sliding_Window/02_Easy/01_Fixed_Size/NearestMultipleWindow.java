/*Problem N — Nearest Multiple Window
Easy · Fixed-Size Sliding Window · Mathematical Logic

Java file: NearestMultiple.java
1. Problem statement
Given an integer array arr, a fixed window size k, and a positive integer divisor, count how many contiguous windows of size k have a sum that is exactly divisible by divisor.

A window is valid when:
\[
windowSum \bmod divisor = 0
\]

2. Example
int arr[] = {3, 5, 2, 6, 4, 1, 7};
int k = 3;
int divisor = 5;


Expected output:
3

3. Understand the problem
Window	Sum	Sum % 5	Valid?
[3, 5, 2]	10	0	Yes
[5, 2, 6]	13	3	No
[2, 6, 4]	12	2	No
[6, 4, 1]	11	1	No
[4, 1, 7]	12	2	No
Correction: The expected output is 1, because only the first window has a sum divisible by 5. */
public class NearestMultipleWindow {
    public static void main(String[] args) {
       int arr[] = {3, 5, 2, 6, 4, 1, 7};
       int k = 3;
       int divisor = 5;
       int windowSum = 0;
       int count = 0;
       
       for(int i = 0; i < k; i++){
        windowSum = windowSum + arr[i];
       }

       if(windowSum % divisor == 0){
        count++;
       }

       for(int i = k; i < arr.length; i++){
        windowSum = windowSum - arr[ i - k] + arr[i];
        if(windowSum % divisor == 0){
        count++;
       }
       }
       System.out.println("Total Count:-" + count);

    }
}
