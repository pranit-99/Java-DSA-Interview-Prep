/*Problem C — Count Occurrences of a Target Element
Independent Practice 1
Difficulty: Absolute Beginner
Topic: Linear Search
Java File Name: CountOccurrences.java
1. Problem Statement
Given an integer array and a target value, count how many times the target appears in the array using Linear Search.

You must traverse the array and count every occurrence of the target.
2. Example 1
Input:
int arr[] = {5, 10, 5, 20, 5, 30, 10};
int target = 5;


Expected Output:
Target 5 appears 3 times


3. Example 2
Input:
int arr[] = {2, 4, 6, 8, 10};
int target = 7; */
public class ProblemC {
   public static void main(String args[]){
    int arr[] = {5, 10, 5, 20, 5, 30, 10};
    int target = 5;
    int count  = 0;

    for(int i = 0; i < arr.length; i++){
        if(arr[i] == target){
            count = count + 1;
        }
    }

    System.out.println("Target " + target + " appears " + count + " times");
   } 
}
