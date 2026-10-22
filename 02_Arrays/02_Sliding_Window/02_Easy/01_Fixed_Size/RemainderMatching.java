/*Problem R — Remainder Matching Windows
Easy · Fixed-Size Sliding Window · Modulo Operator

Java file: RemainderMatching.java
1. Problem statement
Given an integer array arr, a fixed window size k, a positive integer divisor, and a required remainder targetRemainder, count how many contiguous windows of size k produce exactly that remainder when their sum is divided by divisor.

A window is valid when:
windowSum % divisor == targetRemainder


For this problem, assume all array elements are nonnegative, divisor > 0, and 0 <= targetRemainder < divisor.
2. Example
int arr[] = {4, 7, 2, 6, 5, 3, 8};
int k = 3;
int divisor = 4;
int targetRemainder = 1;


Expected output:
2


3. Understand the example
Window	Sum	Sum % 4	Matches remainder 1?
[4, 7, 2]	13	1	Yes
[7, 2, 6]	15	3	No
[2, 6, 5]	13	1	Yes
[6, 5, 3]	14	2	No
[5, 3, 8]	16	0	No
Only two windows have remainder 1, so the answer is 2. */
public class RemainderMatching {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 6, 5, 3, 8};
        int k = 3;
        int divisor = 4;
        int targetRemainder = 1;
        int count = 0;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        if(sum % divisor == targetRemainder){
            count++;
        }

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            if(sum % divisor == targetRemainder){
            count++;
        }
        }
        System.out.println(count);
    }
}
