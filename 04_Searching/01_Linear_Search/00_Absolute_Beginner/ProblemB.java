/* Problem B — Find the Index of a Target Element
Guided Problem 2 of 2
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: BasicIndexSearch.java
1. Problem Statement
Given an integer array and a target value, find the index of the first occurrence of the target using Linear Search.

If the target is not present, return -1.

Example 1
int arr[] = {10, 20, 30, 40, 50};
int target = 30;

Expected output:
Target found at index: 2 

Approach — How to Think?
We need to find the position (index) of the target, not simply determine whether it exists.
1. Create a variable index = -1 because we haven't found the target yet.
2. Start traversing the array from index 0.
3. Compare each element with target.
4. If a match is found, store i in index and stop using break.
5. Print the value of index.
Why initialize index = -1?

Because Java array indices start at 0, -1 is a useful value to indicate that no matching element was found.*/
public class ProblemB {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        System.out.println("Target found at index: " + index);
    }
}
