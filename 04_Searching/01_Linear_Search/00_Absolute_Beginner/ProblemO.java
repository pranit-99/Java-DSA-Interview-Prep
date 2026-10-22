/*Problem O — Find the First Multiple of Both Numbers
Independent Practice 13
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindMultipleOfBoth.java
1. Problem Statement
Given an integer array and two positive target numbers, find the index of the first element divisible by both target numbers using Linear Search.

If no such element exists, print -1.
2. Example 1
int arr[] = {7, 10, 18, 24, 30, 36, 15};
int target1 = 3;
int target2 = 4;


Expected output:
First multiple of both numbers found at index: 3 */
public class ProblemO {
    public static void main(String[] args) {
        int arr[] = {7, 10, 18, 24, 30, 36, 15};
        int target1  = 3;
        int target2 = 4;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % target1 == 0 && arr[i] % target2 == 0 ){
                index = i;
                break;
            }
        }
        System.out.println("First multiple of both numbers found at index " + index);
    }
}
