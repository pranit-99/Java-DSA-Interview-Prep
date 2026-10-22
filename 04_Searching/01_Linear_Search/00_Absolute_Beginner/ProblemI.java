/*Problem I — Find the Index of the Minimum Element
Independent Practice 7
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindMinimumIndex.java
Problem Statement
Given an integer array, find the index of the smallest element using Linear Search.

If the smallest element appears multiple times, return the index of its first occurrence.
Example 1
int arr[] = {18, 7, 25, 3, 12, 9};


Expected output:
Minimum element found at index: 3 */
public class ProblemI {
    public static void main(String[] args) {
        int arr[] = {18, 7, 25, 3, 12, 9};
        int minimum = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
                index = i;
            }
        }
        System.out.println("Minimum Element " + minimum + " found at: " + index);
    }
}
