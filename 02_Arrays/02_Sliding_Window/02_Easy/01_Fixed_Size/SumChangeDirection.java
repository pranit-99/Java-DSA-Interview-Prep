/*Problem S — Sum Change Direction
Easy · Fixed-Size Sliding Window · Comparison and Direction Changes

Java file: SumChangeDirection.java
1. Problem statement
Given an integer array arr and a fixed window size k, count how many times the direction of consecutive window sums changes from increasing to decreasing or from decreasing to increasing.

For example:
- Increasing → Decreasing = 1 direction change.
- Decreasing → Increasing = 1 direction change.
- Increasing → Increasing = No change.
- Decreasing → Decreasing = No change.
If two consecutive window sums are equal, ignore that comparison and keep the previous direction.
2. Example
int arr[] = {2, 5, 1, 7, 3, 6, 2};
int k = 3;


Expected output:
3


3. Understand the example
First, calculate the sum of every window.
Window	Sum	Direction compared to previous	Direction changes
[2, 5, 1]	8	Starting window	0
[5, 1, 7]	13	Increasing ↑	0
[1, 7, 3]	11	Decreasing ↓	1
[7, 3, 6]	16	Increasing ↑	2
[3, 6, 2]	11	Decreasing ↓	3 */
public class SumChangeDirection {
    public static void main(String args[]){
        int arr[] = {2, 5, 1, 7, 3, 6, 2};
        int k  = 3;
        int windowSum = 0;
        int previousSum;
        int previousDirection = 0;
        int count  = 0;

        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        previousSum = windowSum;

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            int currentDirection = 0;

            if(windowSum > previousSum){
                currentDirection = 1;
            }else if(windowSum < previousSum){
                currentDirection = -1;
            }

            if(currentDirection != 0){
                if(previousDirection != 0 && currentDirection != previousDirection){
                    count++;
                }
                previousDirection = currentDirection;
            }
            previousSum =  windowSum;
        }
        System.out.println("Direction Changes: " + count);
    }
}
