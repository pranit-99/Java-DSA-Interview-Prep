/*Problem P — Find the First Odd Number Greater Than Target
Independent Practice 14
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindOddGreaterThanTarget.java
1. Problem Statement
Given an integer array and a target value, find the index of the first odd number that is strictly greater than the target using Linear Search.

If no such element exists, print -1.
2. Example 1
int arr[] = {4, 8, 11, 14, 17, 9, 21};
int target = 12;


Expected output:
First odd number greater than target found at index: 4 */
public class ProblemP {
    public static void main(String[] args) {
        int arr[] = {4, 8, 11, 14, 17, 9, 21};
        int target = 12;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0 && arr[i] > target){
                index = i;
                break;
            }
        }
        System.out.println("First odd number greater than target found at index:" + index);
    }
}
