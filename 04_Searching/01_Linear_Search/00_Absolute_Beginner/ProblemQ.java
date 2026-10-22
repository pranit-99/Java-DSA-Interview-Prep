/*Problem Q — Find the First Number Within a Range
Independent Practice 15
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindNumberInRange.java
1. Problem Statement
Given an integer array and two values, lower and upper, find the index of the first element that lies within the given range, including both boundaries.

If no element is within the range, print -1.
2. Example 1
int arr[] = {5, 12, 25, 8, 30, 18};
int lower = 15;
int upper = 28;


Expected output:
First number within range found at index: 2 */
public class ProblemQ {
   public static void main(String[] args) {
       int arr[] = {5, 12, 25, 8, 30, 18};
       int lower = 15;
       int upper = 28;
       int index = -1;

       for(int i = 0; i < arr.length; i++){
        if(arr[i] > lower && arr[i] < upper){
            index = i;
            break;
        }
       }
       System.out.println("First number within range found at index:" + index);
   } 
}
