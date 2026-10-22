/*Problem F — Find First Negative Number in Each Window
Easy
Fixed-Size Sliding Window

FirstNegative.java

1. Problem Statement
Given an integer array arr and an integer k, find the first negative number in every contiguous subarray of exactly size k.

If a window contains no negative numbers, print 0.

You must solve this using the fixed-size sliding-window technique, with arrays and basic Java concepts only.
Example
int arr[] = {-8, 2, 3, -6, 10};
int k = 2;


Expected output:
-8
0
-6
-6


2. Example Explanation
Window	First negative	Output
[-8, 2]	-8	-8
[2, 3]	None	0
[3, -6]	-6	-6
[-6, 10]	-6	-6
3. Pattern Recognition — Think Before Coding
We know the window size is fixed at k = 2.

However, this problem is different from Problems A–E.

Previously, we maintained a sum or count. Here, we must identify the first negative element in the current window, which depends on the order of elements.

Consider:
Window 1: [-8, 2, 3]
Window 2: [ 2, 3, -6]


When -8 leaves, we need to know where the next negative number is.

A simple negativeCount cannot tell us which negative number comes first.
Hint: Think about indices
You can maintain the index of a negative number and check whether it still belongs to the current window.

For a window starting at start and ending at end, a valid index must satisfy:
\[
start \leq index \leq end
\]

For an efficient solution with basic arrays, consider storing the indices of negative elements in a separate array and moving a pointer forward as the window slides */
public class FirstNegative {
    public static void main(String[] args) {
        int arr[] = {-8, 2 ,3, -6, 10};
        int k  = 2;
        int negativeIndices[] = new int[arr.length];
        int front = 0;
        int rear = 0;

        for(int i = 0; i < k; i++){
            if(arr[i] < 0){
                negativeIndices[rear] = i;
                rear++;
            }
        }
        if(front < rear){
            System.out.println(arr[negativeIndices[front]]);
        }else{
            System.err.println(0);
        }

        //Step 3: Slide the window
        for(int i = k; i < arr.length; i++){
            if(front < rear && negativeIndices[front] <= i - k){
                front++;
            }

            //Add incoing neg index
            if(arr[i] < 0){
                negativeIndices[rear] = i;
                rear++;
            }

            //Step 4: Print current result
            if(front < rear){
                System.err.println(arr[negativeIndices[front]]);
            }else{
                System.out.println(0);
            }
        }
    }
}
