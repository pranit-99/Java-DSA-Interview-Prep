/*Problem H — Find the Index of the Maximum Element
Independent Practice 6
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindMaximumIndex.java
1. Problem Statement
Given an integer array, find the index of the largest element using Linear Search.

If the largest element appears multiple times, return the index of its first occurrence.
2. Example 1
int arr[] = {12, 5, 28, 9, 35, 18};


Expected output:
Maximum element found at index: 4 */
public class ProblemH {
    public static void main(String args[]){
        int arr[] = {12, 5, 28, 9, 35, 18};
        int index = -1;
        int maximum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum Element " + maximum + " found at: " + index);
    }
}
