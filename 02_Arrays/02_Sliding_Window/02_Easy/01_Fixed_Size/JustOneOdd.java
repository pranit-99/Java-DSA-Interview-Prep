/*Problem J — Just One Odd Number
Easy
Fixed-Size Sliding Window

JustOneOdd.java

1. Problem statement
Given an integer array arr and an integer k, find the maximum sum among all contiguous windows of size k that contain exactly one odd number.

If no window contains exactly one odd number, return -1.

You must use the fixed-size sliding-window technique.
Example
int arr[] = {2, 3, 4, 6, 5, 8, 2};
int k = 3;


Expected output:
19


2. Understand the problem
Window	Sum	Odd count	Valid?
[2, 3, 4]	9	1	Yes
[3, 4, 6]	13	1	Yes
[4, 6, 5]	15	1	Yes
[6, 5, 8]	19	1	Yes
[5, 8, 2]	15	1	Yes
The maximum sum among valid windows is 19. */
public class JustOneOdd {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 5, 8, 2};
        int k = 3;

        int windowSum = 0;
        int oddCount = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean found = false;

        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        if(oddCount == 1){
            maxSum = windowSum;
            found = true;
        }

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            if(arr[i - k] % 2 != 0){
                oddCount--;
            }

            if (arr[i] % 2 != 0) {
                oddCount++;
            }

            if(oddCount == 1){
            maxSum = Math.max(maxSum, windowSum);
            found = true;
            }
        }

        if(found){
            System.out.println(maxSum);
        }else{
            System.out.println(-1);
        }
    }
}
