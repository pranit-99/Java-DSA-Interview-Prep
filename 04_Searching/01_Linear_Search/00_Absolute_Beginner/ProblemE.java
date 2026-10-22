/*Problem E — Find the Last Occurrence of a Target
Independent Practice 3
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindLastOccurrence.java
1. Problem Statement
Given an integer array and a target value, find the index of the last occurrence of the target using Linear Search.

If the target does not exist, print -1.
2. Example 1
Input:
int arr[] = {5, 10, 20, 10, 30, 10, 40};
int target = 10;


Expected Output:
Last occurrence found at index: 5


3. Example 2
Input:
int arr[] = {3, 6, 9, 12, 15};
int target = 7;


Expected Output:
Last occurrence found at index: -1


4. Your Task
Write a Java program that:
1. Traverses the array using Linear Search.
2. Finds the last index where arr[i] == target.
3. Prints -1 if the target is not present. */
public class ProblemE {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 10, 30, 10, 40};
        int target = 10;
        int index = -1;
   
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i ;
            }
        }
        System.out.println("Last occurrence found at index: "+index );
    }
}
