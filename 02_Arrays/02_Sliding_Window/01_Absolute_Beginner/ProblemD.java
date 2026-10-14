/*Problem D — Detect Zero in Each Window
Absolute Beginner
Fixed-Size Sliding Window

1. Problem Statement
Given an integer array arr and an integer k, determine whether each contiguous window of size k contains at least one zero.
Print true if the window contains a zero; otherwise, print false.
2. Example
Input:
int[] arr = {1, 0, 3, 4, 0, 6, 7};
int k = 3;


Expected Output:
true
true
true
true
true */
public class ProblemD {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 4, 0, 6, 7};
        int k = 3;
        int zeroCount = 0;
        //First Window
        for(int i = 0; i < k; i++){
            if(arr[i] == 0){
               zeroCount++;
            }
        }
        System.out.println(zeroCount > 0);

        //Slide the window
        for(int i = k; i < arr.length; i++){
            if(arr[i - k] == 0){
                zeroCount--;
            }

            if(arr[i] == 0){
                zeroCount++;
            }
            System.out.println(zeroCount > 0);
        }
    }
}
