/*Problem E — Exactly Two Even Numbers
Easy
Fixed-Size Sliding Window

ExactlyTwoEven.java

1. Problem Statement
Given an integer array arr and an integer k, count the number of contiguous subarrays of exactly size k that contain exactly two even numbers.
int arr[] = {2, 1, 4, 3, 6, 5};
int k = 3;


Expected output: 2
2. Pattern Recognition — How should we think?
Before writing code, identify these three things:

First: Is the window fixed or variable?

The problem says exactly k consecutive elements. Therefore, it is a fixed-size sliding window.

Second: What information do we need to maintain?

We don't need the sum of the window. We only need to know how many even numbers are currently present.

So we maintain two variables:
int evenCount = 0;
int count = 0;


- evenCount stores the number of even elements in the current window.
- count stores the number of windows containing exactly two even elements.
Third: What condition makes a window valid?
if (evenCount == 2) {
    count++;
}


Notice that we use == 2, not >= 2, because the problem asks for exactly two even numbers. */
public class ExactTwoEven {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3, 6, 5};
        int k = 3;
        int evenCount = 0;
        int count = 0;

        //Step 1:- Calculate first window
        for(int i = 0; i < k ; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }

        //Step 2: check first window
        if(evenCount == 2){
            count++;
        }

        for(int i = k; i < arr.length; i++){
            //Removing outgoing element
            if(arr[i - k] % 2 == 0){
                evenCount--;
            }

            //Add incoming element
            if(arr[i] % 2 == 0){
                evenCount++;
            }

            if(evenCount == 2){
                count++;
            }
        }
        System.out.println("Valid Windows: " + count);
    }
}
