/*Problem A: Compare First and Last Elements
Absolute Beginner
 Opposite Direction

Problem Statement
Given an integer array, check whether the first and last elements are equal.
Return true if both elements are equal; otherwise, return false.
Example 1
Input:  arr = {5, 2, 8, 3, 5}
Output: true


Example 2
Input:  arr = {10, 20, 30, 40}
Output: false


Example 3
Input:  arr = {7, 7}
Output: true */
public class ProblemA {
    public static boolean isEqual(int arr[]){
        int left = 0;
        int right = arr.length - 1;

            if(arr[left] == arr[right]){
                return true;
            }else{
                return false;
            }
    }
    public static void main(String args[]){
        int arr[] = {5, 2, 8, 3, 5};
        System.out.print("Input: "); 
        for(int i  = 0; i < arr.length; i++){
          System.out.print(arr[i] + " ");  
        }
        System.err.println();
        System.out.println("Output: " + isEqual(arr));
    }
}
