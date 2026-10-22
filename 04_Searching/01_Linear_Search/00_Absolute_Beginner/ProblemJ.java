/*Problem J — Find the Second Occurrence of a Target
Independent Practice 8
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: FindSecondOccurrence.java
1. Problem Statement
Given an integer array and a target value, find the index of the second occurrence of the target using Linear Search.

If the target appears fewer than two times, print -1.
2. Example 1
int arr[] = {5, 10, 20, 10, 30, 10, 40};
int target = 10;


Expected output:
Second occurrence found at index: 3 */
public class ProblemJ {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 10, 30, 10, 40};
        int target = 10;
        int index  = -1;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count = count + 1;
                if(count == 2){
                    index = i;
                    break;
                }
            }
        }
        System.out.println("Second Element found at index: " +index);
    }
}
