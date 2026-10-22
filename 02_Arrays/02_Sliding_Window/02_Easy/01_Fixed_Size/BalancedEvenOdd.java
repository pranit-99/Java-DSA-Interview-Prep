/*Problem B — Balanced Even and Odd Window
Easy
Fixed-Size Sliding Window

ProblemB.java

1. Problem Statement
Given an integer array arr and an integer k, count the number of contiguous subarrays of exactly size k that contain an equal number of even and odd elements.
Example
int[] arr = {2, 3, 4, 5, 6, 7};
int k = 4;


Expected output:
3


Explanation
Window	Even count	Odd count	Balanced?
[2, 3, 4, 5]	2	2	Yes
[3, 4, 5, 6]	2	2	Yes
[4, 5, 6, 7]	2	2	Yes
All three windows contain an equal number of even and odd elements.
2. Approach — How should we think?
Step 1: Recognize the pattern

The statement mentions exactly k consecutive elements. This tells us to use the fixed-size sliding window technique.

Step 2: Decide what to maintain

Unlike Problem A, we don't need windowSum.

Instead, we maintain:
int evenCount = 0;
int oddCount = 0;
int count = 0;


- evenCount tracks even numbers inside the current window.
- oddCount tracks odd numbers inside the current window.
- count tracks how many windows are balanced.
Step 3: Build the first window

For each element in the first k positions:
- If arr[i] % 2 == 0, increase evenCount.
- Otherwise, increase oddCount.
Then check:
if (evenCount == oddCount) {
    count++;
}


Step 4: Slide the window

This is the important part of today's problem.

Whenever the window moves, we must update both counters correctly.

For example, moving from [2, 3, 4, 5] to [3, 4, 5, 6]:
- 2 leaves the window, so decrease evenCount.
- 6 enters the window, so increase evenCount.
- Then check whether the counts are equal.
We do not need to scan the entire window again.
3. Visualize the window movement
Window 1 of 3
Balanced

2

0


3

1


4

2


5

3


6

4


7

5



Even count
2


Odd count
2


Valid windows
1



Initial window: [2, 3, 4, 5]. There are 2 even and 2 odd numbers.
 PreviousNext window 

4. Your turn — Write the Java solution
Try implementing ProblemB.java yourself using the approach above.

Here is a starter structure:

public class ProblemB {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7};
        int k = 4;

        int evenCount = 0;
        int oddCount = 0;
        int count = 0;

        // Step 1: Count even and odd in first window

        // Step 2: Check whether first window is balanced

        // Step 3: Slide the window
        // Remove outgoing element from its counter
        // Add incoming element to its counter

        // Step 4: Check balance after every slide

        System.out.println("Balanced Windows: " + count);
    }
}



5. Test cases
Test Case 1

arr = {1, 2, 3, 4, 5, 6}, k = 2


Test Case 2

arr = {2, 4, 6, 8}, k = 2


Test Case 3

arr = {1, 2, 3, 4, 5}, k = 3


Reveal expected outputs
Complexity target: O(n) time and O(1) extra space. */
public class BalancedEvenOdd {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4,5, 6, 7};
        int k = 4;

        int evenCount = 0;
        int oddCount = 0;
        int count = 0;

        //Step 1:- Even and Odd in first windoe
        for(int i = 0; i < k; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        //Step 2:- check if balanced
        if(evenCount == oddCount){
            count++;
        }

        //Step 3 slide the window
        for(int i = k; i < arr.length; i++){
            if(arr[i - k] % 2 == 0){
                evenCount--;
            }else{
                oddCount--;
            }

            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }

            if(evenCount == oddCount){
                count++;
            }
        }
        System.err.println("Balanced:- " + count);
    }
}
