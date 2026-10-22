/*1. Problem Statement
Given an integer array and a target value, find the index of the first element greater than the target using Linear Search.

If no element is greater than the target, print -1.
2. Example 1
int arr[] = {4, 8, 12, 6, 15, 3};
int target = 10;


Expected output:
First greater element found at index: 2 */
public class ProblemG {
    public static void main(String args[]){
        int arr[] = {4, 8, 12, 6, 15, 3};
        int target = 10;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > target){
                index = i;
                break;
            }
        }
        System.out.println("First Greater element found at index: "+index );
    }
}
