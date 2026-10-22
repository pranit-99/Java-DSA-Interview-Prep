/*Problem I — Increasing Sum Windows
Easy
Fixed-Size Sliding Window

IncreasingSum.java

1. Problem statement
Given an integer array arr and an integer k, count how many fixed-size windows have a sum strictly greater than the previous window's sum.

You must solve this using the fixed-size sliding-window technique.
Example
int arr[] = {2, 4, 1, 5, 3, 6};
int k = 3;


Expected output:
2


2. Understand the problem
Window	Window sum	Previous sum	Increasing?
[2, 4, 1]	7	—	No comparison
[4, 1, 5]	10	7	Yes
[1, 5, 3]	9	10	No
[5, 3, 6]	14	9	Yes
There are 2 windows whose sums are greater than the immediately preceding window. */
public class IncreasingSum {
    public static void main(String args[]){
        int arr[] = {2, 4, 1, 5, 3, 6};
        int k = 3;

        int windowSum = 0;
        int previousWindowSum = 0;
        int count = 0;

        //First window
        for(int i = 0; i < k ; i++){
            windowSum = windowSum + arr[i];
        }

        //Store first window
        previousWindowSum = windowSum;

        //step 3: slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            if(windowSum > previousWindowSum){
                count++;
            }

            previousWindowSum = windowSum;
        }
        System.out.println("Increasing Windows: " +count);
    }
}
