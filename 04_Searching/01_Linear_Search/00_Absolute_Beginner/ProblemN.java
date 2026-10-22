/*Problem N — Find the Last Even Number
Independent Practice 12
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindLastEven.java
1. Problem Statement
Given an integer array, find the index of the last even number using Linear Search.

If no even number exists, print -1.
2. Example 1
int arr[] = {3, 8, 5, 12, 7, 16, 9};


Expected output:
Last even number found at index: 5 */
public class ProblemN {
    public static void main(String[] args) {
        int arr[] = {3, 8, 5, 12, 7, 16, 9};
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                index = i;
            }
        }
        System.out.println("Last even number found at index: "+ index);
    }
}
