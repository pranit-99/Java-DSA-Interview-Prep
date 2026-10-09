/*Problem B: Check Whether the First Element Is Greater Than the Last
Absolute Beginner
 Opposite Direction

Problem Statement
Given an integer array, determine whether the first element is greater than the last element.
Return true if the first element is greater; otherwise, return false.
Example 1
Input:  arr = {10, 4, 6, 2, 5}
Output: true


Example 2
Input:  arr = {2, 8, 4, 6, 9}
Output: false


Example 3
Input:  arr = {7, 3, 7}
Output: false */
public class ProblemB {
    public static boolean isGreater(int arr[]){
        int left = 0;
        int right = arr.length - 1;

            if(arr[left] > arr[right]){
                return true;
            }else{
                return false;
            }
    }
    public static void main(String args[]){
        int arr[] = {3, 10, 4, 6, 2, 5};
        System.out.print("Input: "); 
        for(int i  = 0; i < arr.length; i++){
          System.out.print(arr[i] + " ");  
        }
        System.err.println();
        System.out.println("Output: " + isGreater(arr));
    }
}
