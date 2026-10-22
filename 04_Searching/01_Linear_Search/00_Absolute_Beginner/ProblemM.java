/*Problem M — Find the First Element Smaller Than Target
Independent Practice 11
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindFirstSmaller.java
1. Problem Statement
Given an integer array and a target value, find the index of the first element strictly smaller than the target using Linear Search.

If no element is smaller than the target, print -1.
2. Example 1
int arr[] = {15, 12, 9, 18, 6, 20};
int target = 10;


Expected output:
First smaller element found at index: 2 */
public class ProblemM {
    public static void main(String[] args) {
        int arr[] = {15, 12, 9, 18, 6, 20};
        int index = -1;
        int target = 10;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < target){
                index = i;
                break;
            }
        }
        System.out.println("First smaller element found at index: " + index);
        
    }
}
