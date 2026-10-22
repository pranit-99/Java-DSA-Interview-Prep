/*Problem L — Find the First Element Equal to Its Index
Independent Practice 10
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindIndexMatch.java
1. Problem Statement
Given an integer array, find the index of the first element whose value is equal to its index using Linear Search.

If no such element exists, print -1.
2. Example 1
int arr[] = {5, 8, 2, 7, 4, 9};


Expected output:
First index match found at index: 2


Explanation: At index 2, the element is 2, so the value matches its index. Although index 4 also matches, we need the first occurrence. */
public class ProblemL {
    public static void main(String[] args) {
        int arr[] = {5, 8, 2, 7, 4, 9};
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == i){
                index = i;
                break;
            }
        }
        System.out.println("First index match found at index "+ index);
    }
}

