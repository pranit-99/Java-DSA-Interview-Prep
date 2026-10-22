/*Problem D — Detect the First Negative Number
Independent Practice 2
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: DetectFirstNegative.java
Problem Statement
Given an integer array containing positive and negative numbers, find the index of the first negative number using Linear Search.

If no negative number exists, print -1.
Example 1
int arr[] = {4, 7, -3, 8, -6, 10};


Expected output:
First negative number found at index: 2


Example 2
int arr[] = {5, 10, 15, 20};


Expected output:
First negative number found at index: -1 */
public class ProblemD {
    public static void main(String[] args) {
        int arr[] = {4, 7, -3, 8, -6, 10};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.println("First negative number found at index: " + i);
                break;
            }
        }
    }
}
