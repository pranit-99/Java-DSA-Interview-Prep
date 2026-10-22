/*Problem F — Find the First Even Number
Independent Practice 4
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindFirstEven.java
Problem Statement
Given an integer array, find the index of the first even number using Linear Search.

If the array contains no even numbers, print -1.
Example 1
int arr[] = {3, 7, 9, 12, 5, 8, 11};


Expected output:
First even number found at index: 3 */
public class ProblemF {
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 12, 5, 8, 11};
        int index = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                index = i;
                break;
            }
        }
        System.out.println("First Even Number found at index: "+index );
    }
}
