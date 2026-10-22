/*Problem K — Find the First Element Divisible by Target
Independent Practice 9
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindFirstDivisible.java
1. Problem Statement
Given an integer array and a target value, find the index of the first element that is divisible by the target using Linear Search.

If no element is divisible by the target, print -1.

Assume the target is never zero.
2. Example 1
int arr[] = {7, 11, 15, 22, 30, 8};
int target = 5;


Expected output:
First divisible element found at index: 2 */
public class ProblemK {
    public static void main(String[] args) {
        int arr[] = {7, 11, 15, 22, 30, 8};
        int target = 5;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % target == 0){
                index = i;
                break;
            }
        }
        System.out.println("First divisible element found at index: "+ index);
    }
}
