/*Problem K — Keep Windows Within a Range
Easy · Fixed-Size Sliding Window · Arrays Only

Java file: KeepWithinRange.java
1. Problem statement
Given an integer array arr, a window size k, and two integers lowerLimit and upperLimit, count how many contiguous windows of size k have a sum between the two limits, inclusive.

A window is valid when:
\[
lowerLimit \leq windowSum \leq upperLimit
\]

2. Example
int arr[] = {2, 5, 1, 4, 3, 6, 2};
int k = 3;

int lowerLimit = 9;
int upperLimit = 12;


Expected output:
4


3. Understand the example
Window	Sum	Within 9–12?
[2, 5, 1]	8	No
[5, 1, 4]	10	Yes
[1, 4, 3]	8	No
[4, 3, 6]	13	No
[3, 6, 2]	11	Yes
Correction: The expected output for this example is 2, because only two windows satisfy the condition. */
public class KeepWindowsWithinRange {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 4, 3, 6, 2};
        int k = 3;
        int lowerLimit = 9;
        int upperLimit = 12;
        int sum = 0;
        int count = 0;

        //1. Create First window
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }

        if(sum >= 9 && sum <= 12 ){
            count++;
        }

        //Slide the window
        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            if(sum >= 9 && sum <= 12 ){
            count++;
        }
        }
        System.out.println("Count of between Lower limit " + lowerLimit + " and Upper Limit" + upperLimit +" is  :-"+count);
    }
}
